package com.test.demo.controller;

import com.test.demo.dao.TestMappper;
import com.test.demo.model.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @description: 测试用例
 * @author: 韩明华
 * @create: 2020-04-30 15:42
 **/
@RequestMapping("/api/hello")
@RestController
public class HelloController {
  @Resource
  private TestMappper testMappper;

    @GetMapping("/test")
    public List<Test> test(){
      /*  Test test=new Test();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        test.setAge(15).setName("小名").setPassword("456").setId(uuid);
        testMappper.insert(test);
*/
        List<Test> tests = testMappper.selectList(null);
        return tests;
    }

}
