package com.todo.springboot.mytodoapp.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String user, String pass) {
        boolean isvalidUser = user.equalsIgnoreCase("Andries");
        boolean isvalidPass = pass.equalsIgnoreCase("Pass");
        return isvalidUser && isvalidPass;
    }

}
