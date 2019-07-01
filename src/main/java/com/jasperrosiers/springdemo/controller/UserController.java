package com.jasperrosiers.springdemo.controller;

import com.jasperrosiers.springdemo.model.User;
import com.jasperrosiers.springdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/new")
    public User postUser(@RequestBody User user) {
       return userRepository.save(user);
    }
}
