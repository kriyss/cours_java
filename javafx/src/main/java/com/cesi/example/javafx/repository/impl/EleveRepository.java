package com.cesi.example.javafx.repository.impl;

import com.cesi.example.javafx.model.Student;
import com.cesi.example.javafx.repository.Repository;

import java.util.*;
import java.util.stream.Collectors;

public class EleveRepository implements Repository<Student, String> {

    private Map<String, Student> store = new HashMap<>(20);

    @Override
    public Student create(Student student) {
        student.setId(UUID.randomUUID().toString());
        store.put(student.getId(), student);
        return student;
    }

    @Override
    public Student read(String key) {
        return store.get(key);
    }

    @Override
    public Student update(Student student) {
        return store.put(student.getId(), student);
    }

    @Override
    public void delete(String s) {
        store.remove(s);
    }

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(store.values());
    }
}
