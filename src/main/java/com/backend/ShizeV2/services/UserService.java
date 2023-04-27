package com.backend.ShizeV2.services;

import com.backend.ShizeV2.exception.UserNotFoundException;
import com.backend.ShizeV2.models.Info;
import com.backend.ShizeV2.repository.InfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserService {
    private final InfoRepo infoRepo;


    @Autowired
    public UserService(InfoRepo infoRepo) {
        this.infoRepo = infoRepo;
    }

    //CRUD//
    public Info addUser(Info info) {
        return infoRepo.save(info);
    }
    public List<Info> getUser() {

        return infoRepo.findAll();
    }
    public Info updateUser(Info info) {
        return infoRepo.save(info);
    }
    public void deleteUser(Long id){
        infoRepo.deleteById(id);
    }
    public Info findUserById(Long id) {
        return infoRepo.findById(id).orElseThrow(() ->new UserNotFoundException("Info not found"));
    }
}
