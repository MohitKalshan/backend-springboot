package com.spring_project.java_backend.repository;

import com.spring_project.java_backend.dto.CreateUserDto;
import com.spring_project.java_backend.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Repository
public class UserRepository {
    List<UserDto> users = new ArrayList<>();

    public UserRepository(){
        users.add(new UserDto(UUID.randomUUID().toString(), "Mohit", "mohit@example.com"));
        users.add(new UserDto(UUID.randomUUID().toString(), "Rahul", "rahul@example.com"));
    }

    //Find all user logic
    public List<UserDto> findAll(){
        return this.users;
    }

    // Find user by id logic
    public UserDto findUserById(String id) {
        for(UserDto user: users){
            if(Objects.equals(user.getId(), id)){
                return user;
            }
        }
        return null;
    }

    //Create User logic
    public UserDto saveUser(CreateUserDto createUserDto) {
        UserDto user = new UserDto(UUID.randomUUID().toString(),createUserDto.getName(), createUserDto.getEmail());
        users.add(user);
        return user;
    }

//    Update user logic
    public UserDto updateUser(CreateUserDto updateUserDto, String id){
        for(UserDto user: users){
            if(user.getId().equals(id)){
                user.setName(updateUserDto.getName());
                user.setEmail(updateUserDto.getEmail());
                return user;
            }
        }
        return null;
    }
}
