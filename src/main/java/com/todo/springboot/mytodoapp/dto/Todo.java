package com.todo.springboot.mytodoapp.dto;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDate;

public class Todo implements Serializable {

    private int id;
    private String userName;
    private String description;
    private LocalDate targetDate;
    private Boolean isDone;

    public Todo(int id, String userName, String description, LocalDate targetDate, Boolean isDone) {
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public Boolean isDone() {
        return isDone;
    }

    public void setDone(Boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", isDone=" + isDone +
                '}';
    }
}
