package com.example.springprofile.dao;

import com.example.springprofile.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
