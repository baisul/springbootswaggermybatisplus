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
public class Teacher implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    private String tname;

    /**
     * 工号
     */
    private String tno;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 教的课程
     */
    private String cource;


}

