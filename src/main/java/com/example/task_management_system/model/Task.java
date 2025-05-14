package com.example.task_management_system.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import jakarta.validation.constraints.NotNull;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Title is required")
    private String title;
    @NotNull(message = "Description is required")
    private String description;
    private boolean status;
    private LocalDateTime createdDate = LocalDateTime.now();

    public Task() {
        this.status = false;
    }

    public Task(String title, String description, boolean status, LocalDateTime createdDate) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.createdDate = createdDate;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
