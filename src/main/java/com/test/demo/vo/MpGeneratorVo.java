package com.test.demo.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @description: 代码生成器实体
 * @author: 韩明华
 * @create: 2020-05-15 11:45
 **/

@Data
@Accessors(chain = true)
public class MpGeneratorVo {

    /**
    * 文件路径地址
    */
    private String outputDir;

    /**
     *创建人
     */
    private String author;

    /**
     *数据库连接地址
     */
    private String url;

    /**
     *数据库登录账号
     */
    private String username;

    /**
     *数据库登录密码
     */
    private String password;

    /**
     *生成实体表名称
     */
    private String include;
}


