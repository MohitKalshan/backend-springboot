package com.spring_project.java_backend.controllers;

import com.spring_project.java_backend.dto.UserDto;
import com.spring_project.java_backend.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserControllers {
    private final UserService userService;

    public UserControllers(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDto> getAllUSers(){
       return this.userService.getAllUsers();
    }
}
