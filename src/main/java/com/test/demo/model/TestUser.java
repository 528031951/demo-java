package com.test.demo.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/***
* @Description: 角色表
* @Param: 
* @return: 
* @Author: 韩明华
* @Date: 2020/5/9
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("TEST_USER")
public class TestUser implements Serializable {
    /**
     * 角色表主键
     */
    @TableId("ID")
    private String id;

    /**
     * 角色编码
     */
    @TableField("USER_CODE")
    private String userCode;

    /**
     * 密码
     */
    @TableField("PSS_WORD")
    private String pssWord;

    /**
     * 是否禁用（0：否，1：是）
     */
    @TableField("IS_DISABLED")
    private Integer isDisabled;

    private static final long serialVersionUID = 1L;
}