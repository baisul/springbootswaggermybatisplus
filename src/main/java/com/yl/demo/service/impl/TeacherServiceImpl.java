package com.yl.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yl.demo.dao.TeacherMapper;
import com.yl.demo.dto.QueryDto;
import com.yl.demo.dto.TeacherDto;
import com.yl.demo.entity.Teacher;
import com.yl.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getTeaches(QueryDto queryDto) {
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.like("tname","小");
        wrapper.eq("sex",0);
        return teacherMapper.selectList(wrapper);
    }
}
