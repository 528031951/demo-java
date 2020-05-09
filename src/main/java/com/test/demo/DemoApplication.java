package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/***
* @Description:  测试启动
* @Param: 
* @return: 
* @Author: 韩明华
* @Date: 2020/5/6
*/
@SpringBootApplication
@ComponentScan(basePackages = {"com.test.demo.*"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
