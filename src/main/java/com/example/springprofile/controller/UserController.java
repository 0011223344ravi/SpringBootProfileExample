package com.example.springprofile.controller;

import com.example.springprofile.model.User;
import com.example.springprofile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;


    @PostMapping("/saveUser")
    public void saveUser(@RequestBody User user) {
        service.SaveUsers(user);
       // return service.getUsers();
    }

    @GetMapping("/findAllUsers")
    public List<User> findAllUsers() {
        return service.getUsers();
    }

}
