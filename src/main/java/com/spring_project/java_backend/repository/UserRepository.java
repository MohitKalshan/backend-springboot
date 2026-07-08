package com.spring_project.java_backend.repository;

import com.spring_project.java_backend.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<UserDto> users = new ArrayList<>();

    public UserRepository(){
        users.add(new UserDto(1, "Mohit", "mohit@example.com"));
        users.add(new UserDto(2, "Rahul", "rahul@example.com"));
    }
    public List<UserDto> findAll(){
        return this.users;
    }
}
