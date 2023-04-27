package com.backend.ShizeV2.controller;

import com.backend.ShizeV2.models.Info;
import com.backend.ShizeV2.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Info> getUser(@PathVariable("id") Long id){
        Info info = userService.findUserById(id);
        return new ResponseEntity<>(info, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Info> editUser(@RequestBody Info info) {
        Info updateInfo = userService.updateUser(info);
        return new ResponseEntity<>(updateInfo, HttpStatus.OK);
    }
}
