package com.example.demo20;
@org.springframework.stereotype.Repository
public class UserRepository {
    public String findUser(){
        return "User from Repository";
    }
}
