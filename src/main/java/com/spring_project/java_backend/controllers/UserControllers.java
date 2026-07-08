package com.spring_project.java_backend.controllers;

import com.spring_project.java_backend.dto.CreateUserDto;
import com.spring_project.java_backend.dto.UserDto;
import com.spring_project.java_backend.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserControllers {
    private final UserService userService;

    public UserControllers(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUSers(){
       return ResponseEntity.status(HttpStatus.OK).body(this.userService.getAllUsers());
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(this.userService.getUserById(id));
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserDto createUserDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.userService.createUser(createUserDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(@RequestBody CreateUserDto updateUserDto, @PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(this.userService.updateUser(updateUserDto,id));
    }
}
