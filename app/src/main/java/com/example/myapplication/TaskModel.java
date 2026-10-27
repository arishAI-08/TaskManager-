package com.example.myapplication;

public class TaskModel {
    private String title;
    private String description;
    private String category;
    private boolean isCompleted;

    public TaskModel(String title, String description, String category, boolean isCompleted) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.isCompleted = isCompleted;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
