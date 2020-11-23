package com.yl.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yl.demo.dao.StudentMapper;
import com.yl.demo.dao.TeacherMapper;
import com.yl.demo.entity.Student;
import com.yl.demo.entity.Teacher;
import com.yl.demo.service.StudentServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentServie {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(Integer id) {
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.eq("id",id);
        return studentMapper.selectList(wrapper).get(0);
    }

    @Override
    public Integer addStudent(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public Integer deleteStudentById(Integer id) {
        return studentMapper.deleteById(id);
    }

    @Override
    public Integer updateStudent(Student student) {
        return studentMapper.updateById(student);
    }
}
