package com.yl.demo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author wfj
 * @since 2020-11-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Student implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    private String sname;

    /**
     * 学号
     */
    private String sno;

    /**
     * 性别,0男，1女
     */
    private Integer sex;

    /**
     * 爱好
     */
    private String hobby;

    /**
     * 邮箱
     */
    private String email;


}

