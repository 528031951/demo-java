package com.test.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
* @Description:  测试启动
* @Param: 
* @return: 
* @Author: 韩明华
* @Date: 2020/5/6
*/
@SpringBootApplication
@MapperScan(basePackages = {"com.test.demo.*"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
