package com.todo.springboot.mytodoapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldController {
    private String hello = "Hello World";

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return hello;
    }

    @RequestMapping("/helloJSP")
    public String helloWorldJSP() {
        return "sayHello";
    }

}
