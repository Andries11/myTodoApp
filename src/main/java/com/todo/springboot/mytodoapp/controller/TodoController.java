package com.todo.springboot.mytodoapp.controller;

import com.todo.springboot.mytodoapp.dto.Todo;
import com.todo.springboot.mytodoapp.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
@RequestMapping("/api/todo")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todoList/{name}")
    public String getTodoList(@PathVariable String name, ModelMap model){
        List<Todo> todos = todoService.findByUser(name);
        model.addAttribute("todos",todos);
        return "todoList";
    }

}
