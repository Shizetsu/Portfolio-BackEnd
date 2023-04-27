package com.backend.ShizeV2.controller;

import com.backend.ShizeV2.models.Education;
import com.backend.ShizeV2.services.EducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
@CrossOrigin(origins = "http://localhost:4200")
public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }
    //CREATE
    @PostMapping("/add")
    public ResponseEntity<Education> addEducation(@RequestBody Education education){
        Education newEducation = educationService.addEducation(education);
        return new ResponseEntity<>(newEducation, HttpStatus.CREATED);
    }
    //RETRIEVE
    @GetMapping("/all")
    public ResponseEntity<List<Education>> getEducation(){
        List<Education> educations = educationService.getEducation();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }
    //UPDATE
    @PutMapping("/update")
    public ResponseEntity<Education> editEducation(@RequestBody Education education) {
        Education updateEducation = educationService.updateEducation(education);
        return new ResponseEntity<>(updateEducation, HttpStatus.OK);
    }
    //DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id){
        educationService.deleteEducation(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
