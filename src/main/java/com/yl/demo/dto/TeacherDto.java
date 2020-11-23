package com.yl.demo.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class TeacherDto implements Serializable {

    /**
     * id
     */
    @ApiModelProperty(value = "主键id")
    private Integer id;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String tname;

    /**
     * 工号
     */
    @ApiModelProperty(value = "工号")
    private String tno;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private Integer sex;

    /**
     * 教的课程
     */
    @ApiModelProperty(value = "教的课程")
    private String cource;
}
