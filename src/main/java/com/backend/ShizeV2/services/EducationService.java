package com.backend.ShizeV2.services;

import com.backend.ShizeV2.models.Education;
import com.backend.ShizeV2.repository.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducationService {
    private final EducationRepo educationRepo;

    @Autowired
    public EducationService(EducationRepo educationRepo) {
        this.educationRepo = educationRepo;
    }
    //CRUD//
    //CREATE
    public Education addEducation(Education education) {
        return educationRepo.save(education);
    }
    //RETRIEVE
    public List<Education> getEducation() {
        return educationRepo.findAll();
    }
    //UPDATE
    public Education updateEducation(Education education) {
        return educationRepo.save(education);
    }
    //DELETE
    public void deleteEducation(Long id){
        educationRepo.deleteById(id);
    }

}
