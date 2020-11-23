package com.yl.demo.service;

import com.yl.demo.dto.QueryDto;
import com.yl.demo.dto.TeacherDto;
import com.yl.demo.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getTeaches(QueryDto queryDto);
}
