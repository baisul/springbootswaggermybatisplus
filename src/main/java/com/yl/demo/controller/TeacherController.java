package com.yl.demo.controller;

import com.yl.demo.dto.QueryDto;
import com.yl.demo.entity.Teacher;
import com.yl.demo.service.TeacherService;
import com.yl.demo.util.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  老师控制器
 * </p>
 *
 * @author wfj
 * @since 2020-11-12
 */
@RestController
@RequestMapping("/teacher")
@Api(value = "老师控制器")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    /**
     * 模糊查询姓名带有“小”字并且sex为0的老师列表
     */
    @PostMapping("/queryTeachers")
    public Result queyTeachers(@RequestBody QueryDto queryDto) {
        List<Teacher> teaches = teacherService.getTeaches(queryDto);
        if (teaches != null) {
            return Result.success(200,"查找成功",teaches);
        } else {
            return Result.fail(0,"暂无数据",null);
        }
    }
}


