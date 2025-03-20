package com.example.demo20;

import org.springframework.stereotype.Service;

@Service

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public String getUser(){
        return userRepository.findUser();
    }
}
