package com.backend.ShizeV2.controller;


import com.backend.ShizeV2.models.Skills;
import com.backend.ShizeV2.services.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }
    //CREATE
    @PostMapping("/add")
    public ResponseEntity<Skills> addSkill(@RequestBody Skills skill){
        Skills newSkill = skillsService.addSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }
    //RETRIEVE
    @GetMapping("/all")
    public ResponseEntity<List<Skills>> getSkills(){
        List<Skills> skills = skillsService.getSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    //UPDATE
    @PutMapping("/update")
    public ResponseEntity<Skills> editSkills(@RequestBody Skills skill) {
        Skills updateSkills = skillsService.updateSkills(skill);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }
    //DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id){
        skillsService.deleteSkill(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
