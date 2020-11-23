package com.yl.demo.util;

import com.baomidou.mybatisplus.extension.api.R;
import lombok.Data;

import java.io.Serializable;

/**
 * 通用结果返回类
 */
@Data
public class Result implements Serializable {
    public int code;
    public String msg;
    public Object data;

   public static Result success() {
       Result result = new Result();
       result.setCode(200);
       result.setMsg("操作成功");
       return result;
   }

    public static Result success(int code,String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result success(int code,String msg,Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("操作成功");
        result.setData(data);
        return result;
    }

    public static Result fail() {
       Result result = new Result();
       result.setCode(0);
       result.setMsg("操作失败");
       return result;
    }

    public static Result fail(int code,String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result fail(int code,String msg,Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}

