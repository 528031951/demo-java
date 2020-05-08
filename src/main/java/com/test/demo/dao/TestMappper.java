package com.test.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.demo.model.Test;
import org.apache.ibatis.annotations.Mapper;

/***
* @Description: 测试用例
* @Param: 
* @return: 
* @Author: 韩明华
* @Date: 2020/5/6
*/
@Mapper
public interface TestMappper extends BaseMapper<Test> {
}
