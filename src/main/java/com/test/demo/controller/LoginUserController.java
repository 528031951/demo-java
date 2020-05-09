package com.test.demo.controller;

import com.test.demo.constants.StatusCode;
import com.test.demo.service.TestUserService;
import com.test.demo.utli.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 登录验证
 * @author: 韩明华
 * @create: 2020-05-09 11:07
 **/
@RestController
@RequestMapping("/api/user")
public class LoginUserController {
    @Resource
    private TestUserService testUserService;

    @GetMapping("/loginUser")
    public Result loginUser(String userName, String password){
        Result result = testUserService.authenticationUser(userName, password);
        if(result.getCode()==0){
            return Result.success("欢迎回来");
        }
        return Result.errorMsg(result.getCode(),result.getMsg());
    }
}
