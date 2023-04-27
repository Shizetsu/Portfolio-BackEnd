package com.backend.ShizeV2.controller;

import com.backend.ShizeV2.models.Education;
import com.backend.ShizeV2.models.Experience;
import com.backend.ShizeV2.services.ExperienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    //CREATE
    @PostMapping("/add")
    public ResponseEntity<Experience> addExperience(@RequestBody Experience experience){
        Experience newExperience = experienceService.addExperience(experience);
        return new ResponseEntity<>(newExperience, HttpStatus.CREATED);
    }
    //RETRIEVE
    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getExperience(){
        List<Experience> experiences = experienceService.getExperience();
        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }
    //UPDATE
    @PutMapping("/update")
    public ResponseEntity<Experience> editExperience(@RequestBody Experience experience) {
        Experience updateExperience = experienceService.updateExperience(experience);
        return new ResponseEntity<>(updateExperience, HttpStatus.OK);
    }
    //DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") Long id){
        experienceService.deleteExperience(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
