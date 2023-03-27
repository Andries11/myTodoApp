package com.todo.springboot.mytodoapp.controller;

import com.todo.springboot.mytodoapp.service.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
@RequestMapping("/api/todo")
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String gotoWellcomPage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if (authenticationService.authenticate(name, password)) {
            model.put("name",name);

            return "welcome";
        }else {
            model.put("errorMessage", "Invalid credentials");
            return "login";
        }
    }

}
