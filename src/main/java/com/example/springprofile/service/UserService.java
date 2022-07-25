package com.example.springprofile.service;

import com.example.springprofile.dao.UserDao;
import com.example.springprofile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = { "local", "dev", "prod" })
public class UserService {
    @Autowired
    private UserDao dao;

    public List<User> getUsers() {
        return dao.findAll();
    }

    public void SaveUsers(User user) {
          dao.save(user);
    }


}
