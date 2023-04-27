package com.backend.ShizeV2.services;

import com.backend.ShizeV2.models.Education;
import com.backend.ShizeV2.models.Experience;
import com.backend.ShizeV2.repository.ExperienceRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ExperienceService {
    private final ExperienceRepo experienceRepo;

    @Autowired
    public ExperienceService(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }

    //CREATE
    public Experience addExperience(Experience experience) {
        return experienceRepo.save(experience);
    }
    //RETRIEVE
    public List<Experience> getExperience() {
        return experienceRepo.findAll();
    }
    //UPDATE
    public Experience updateExperience(Experience experience) {
        return experienceRepo.save(experience);
    }
    //DELETE
    public void deleteExperience(Long id){
        experienceRepo.deleteById(id);
    }

}
