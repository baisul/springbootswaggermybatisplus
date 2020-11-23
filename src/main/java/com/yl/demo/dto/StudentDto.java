package com.yl.demo.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class StudentDto implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "主键id")
    private Integer id;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String sname;

    /**
     * 学号
     */
    @ApiModelProperty(value = "学号")
    private String sno;

    /**
     * 性别,0男，1女
     */
    @ApiModelProperty(value = "性别,0男，1女")
    private Integer sex;

    /**
     * 爱好
     */
    @ApiModelProperty(value = "爱好")
    private String hobby;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;
}
