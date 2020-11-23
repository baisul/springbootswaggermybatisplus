package com.yl.demo.controller;

import com.yl.demo.dto.StudentDto;
import com.yl.demo.entity.Student;
import com.yl.demo.service.StudentServie;
import com.yl.demo.util.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  学生控制器
 * </p>
 *
 * @author wfj
 * @since 2020-11-12
 */
@RestController
@RequestMapping("/student")
@Api(value = "学生控制器")
public class StudentController {

    @Autowired
    private StudentServie studentServie;

    /**
     * 根据id获取学生
     * @return
     */
    @GetMapping("/getStudentById")
    public Result getStudentById(@RequestParam Integer id) {
        Student student = studentServie.getStudentById(id);
        if (student != null) {
            return Result.success(200,"查找成功",student);
        } else {
            return Result.fail();
        }
    }

    /**
     * 添加学生
     * @return
     */
    @PostMapping("/addStudent")
    public Result addStudent(@RequestBody StudentDto studentDto) {
        Student student = new Student();
        BeanUtils.copyProperties(studentDto,student);
        Integer result = studentServie.addStudent(student);
        if (result > 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    /**
     * 根据学生ID删除学生
     * @param id
     * @return
     */
    @DeleteMapping("/deleteStudentById")
    public Result deleteStudentById(@RequestParam Integer id) {
        Integer result = studentServie.deleteStudentById(id);
        if (result > 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    /**
     * 修改学生
     * @return
     */
    @PutMapping("/updateStudent")
    public Result updateStudent(@RequestBody StudentDto studentDto) {
        Student student = new Student();
        BeanUtils.copyProperties(studentDto,student);
        Integer result = studentServie.updateStudent(student);
        if (result > 0) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }
}


