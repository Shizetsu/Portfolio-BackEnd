package com.backend.ShizeV2.services;

import com.backend.ShizeV2.models.Education;
import com.backend.ShizeV2.models.Experience;
import com.backend.ShizeV2.models.Skills;
import com.backend.ShizeV2.repository.SkillsRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;
    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    //CREATE
    public Skills addSkill(Skills skill) {
        return skillsRepo.save(skill);
    }
    //RETRIEVE
    public List<Skills> getSkills() {
        return skillsRepo.findAll();
    }
    //UPDATE
    public Skills updateSkills(Skills skill) {
        return skillsRepo.save(skill);
    }
    //DELETE
    public void deleteSkill(Long id){
        skillsRepo.deleteById(id);
    }

}
