package com.test.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.demo.model.TestUser;
import com.test.demo.utli.Result;

/**
 * @description: 角色service
 * @author: 韩明华
 * @create: 2020-05-09 14:54
 **/
public interface TestUserService extends IService<TestUser> {

    /***
    * @Description: 登录认证
    * @Param: [userName, password]
    * @return: com.test.demo.utli.Result
    * @Author: 韩明华
    * @Date: 2020/5/9
    */
    Result authenticationUser(String  userName, String password);
}
