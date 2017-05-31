package com.cesi.example.javafx.model;

public class Student {
    private String id;
    private String name;
    private String firstName;

    public Student(String name, String firstName, double average) {
        this.name = name;
        this.firstName = firstName;
    }

    public Student() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}

