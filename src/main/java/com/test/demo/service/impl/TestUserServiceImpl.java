package com.test.demo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.demo.constants.StatusCode;
import com.test.demo.dao.TestUserMapper;
import com.test.demo.model.TestUser;
import com.test.demo.service.TestUserService;
import com.test.demo.utli.CheckObjectIsEmpty;
import com.test.demo.utli.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @description: 角色serviceImpl
 * @author: 韩明华
 * @create: 2020-05-09 14:54
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements TestUserService {
    @Resource
    private TestUserMapper testUserMapper;



    /***
    * @Description: 登录认证
    * @Param: [userName, password]
    * @return: com.test.demo.utli.Result
    * @Author: 韩明华
    * @Date: 2020/5/9
    */
    @Override
    public Result authenticationUser(String userName, String password) {
        TestUser testUser = testUserMapper.selectOne(Wrappers.<TestUser>lambdaQuery().eq(TestUser::getUserCode, userName).eq(TestUser::getPssWord, password));
       if( CheckObjectIsEmpty.checkStringIsNull(testUser)){
           return Result.errorMsg(StatusCode.USERNAME_AND_PASSWORD_ERR.getCode(),StatusCode.USERNAME_AND_PASSWORD_ERR.getMsg());
       }
        return Result.success("欢迎回来");
    }
}

