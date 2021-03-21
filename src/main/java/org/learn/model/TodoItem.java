package org.learn.model;

import lombok.*;

import java.time.LocalDate;

//https://projectlombok.org/features/Data
@Data
@EqualsAndHashCode(of = "id")
public class TodoItem {
    private int id;
    private String title;
    private String details;
    private LocalDate deadline;

    public TodoItem(String title, String details, LocalDate deadline) {
        this.title = title;
        this.details = details;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
