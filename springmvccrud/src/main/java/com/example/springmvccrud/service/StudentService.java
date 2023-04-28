package com.example.springmvccrud.service;

import com.example.springmvccrud.entity.Student;

import java.util.List;

public interface StudentService {

    void save(Student student);
    List<Student> getAll();
    Student getById(Integer id);
    void delete(Student student);
}
