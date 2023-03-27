package com.todo.springboot.mytodoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/api/hello")
public class HelloWorldController {
    private String hello = "Hello World";

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return hello;
    }


}
