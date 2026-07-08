package com.spring_project.java_backend.services;

import com.spring_project.java_backend.dto.CreateUserDto;
import com.spring_project.java_backend.dto.UserDto;
import com.spring_project.java_backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUsers() {
       return this.userRepository.findAll();
    }

    public UserDto getUserById(String id) {
        return this.userRepository.findUserById(id);
    }

    public UserDto createUser(CreateUserDto createUserDto) {
        return this.userRepository.saveUser(createUserDto);
    }

    public UserDto updateUser(CreateUserDto updateUserDto, String id) {
        return this.userRepository.updateUser(updateUserDto, id);
    }

    public void deleteUserById(String id) {
        userRepository.deleteUserById(id);
    }
}
