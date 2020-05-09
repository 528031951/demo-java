package com.test.demo.constants;

/**
 * @description: 结果集返回常量
 * @author: 韩明华
 * @create: 2020-05-09 11:18
 **/
public enum StatusCode {

    /**
     * 参数错误
     */
    PARAM_ERROR(501, "参数错误"),

    USERNAME_AND_PASSWORD_ERR(502,"账号或密码错误");



    private final Integer code;
    private final String msg;
    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
