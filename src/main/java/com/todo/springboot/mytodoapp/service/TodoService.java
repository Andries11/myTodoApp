package com.todo.springboot.mytodoapp.service;

import com.todo.springboot.mytodoapp.dto.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class TodoService {

    private static final List<Todo> todos = new ArrayList<>();
    static{
        todos.add(new Todo(1, "Johan", "Learn Camunda", LocalDate.now().plusYears(1), false ));
        todos.add(new Todo(2, "Andries", "Learn Springboot", LocalDate.now().plusYears(2), true ));
        todos.add(new Todo(3, "Andries", "Learn Java", LocalDate.now().plusMonths(1), false ));
        todos.add(new Todo(4, "Andries", "Learn Keycloak", LocalDate.now().plusDays(21), true ));
        todos.add(new Todo(5, "Andries", "Learn Hibernate", LocalDate.now().plusMonths(2), true ));
        todos.add(new Todo(6, "Andries", "Learn Kubernettes", LocalDate.now().plusMonths(6), false ));
        todos.add(new Todo(7, "Petrus", "Learn Azure Cloud Services", LocalDate.now().plusYears(1), true ));
        todos.add(new Todo(8, "Andries", "Learn Data Security", LocalDate.now().plusMonths(8), false ));
        todos.add(new Todo(9, "Andries", "Learn Robotics", LocalDate.now().plusYears(4), false ));
        todos.add(new Todo(10, "Andries", "Learn Small Load Electronics", LocalDate.now().plusYears(1), true ));
    }

    public List<Todo> findByUser(String user) {
        return todos.stream()
                .filter(todo -> todo.getUserName().equals(user))
                .collect(Collectors.toList());

    }
}
