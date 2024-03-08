package com.daniel.studentsystem.service;

import com.daniel.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
