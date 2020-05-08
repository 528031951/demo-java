package com.test.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @description: 测试用例
 * @author: 韩明华
 * @create: 2020-05-06 14:32
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("TEST_ONE")
public class Test {

    @TableId("ID")
    private String id;

    @TableField("NAME")
    private String name;

    @TableField("PASSWORD")
    private String password;

    @TableField("AGE")
    private Integer age;
}
