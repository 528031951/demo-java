package com.test.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.demo.model.TestUser;
import org.apache.ibatis.annotations.Mapper;

/***
* @Description: 角色实体
* @Param: 
* @return: 
* @Author: 韩明华
* @Date: 2020/5/9
*/
@Mapper
public interface TestUserMapper extends BaseMapper<TestUser> {

}
