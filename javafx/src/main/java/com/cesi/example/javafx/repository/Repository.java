package com.cesi.example.javafx.repository;

import java.util.List;

public interface Repository<T, ID> {
    T create(T t);
    List<T> getAll();
    T read(ID key);
    T update(T t);
    void delete(ID id);
}
