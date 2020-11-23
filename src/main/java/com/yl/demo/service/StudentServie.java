package com.yl.demo.service;

import com.yl.demo.entity.Student;
import io.swagger.models.auth.In;

public interface StudentServie {

    Student getStudentById(Integer id);
    Integer addStudent(Student student);
    Integer deleteStudentById(Integer id);
    Integer updateStudent(Student student);
}
