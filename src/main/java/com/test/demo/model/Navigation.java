package com.test.demo.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * -- 导航
 * </p>
 *
 * @author 韩明华
 * @since 2020-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Navigation implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 标题项id
     */
    @TableId("ID")
    private String id;

    /**
     * 标题名称
     */
    @TableField("NAVIGATION_NAME")
    private String navigationName;

    /**
     * 排序
     */
    @TableField("SORT")
    private Integer sort;

    /**
     * 创建人ID
     */
    @TableField("CREATED_BY")
    private String createdBy;

    /**
     * 创建人
     */
    @TableField("CREATED_NAME")
    private String createdName;

    /**
     * 创建时间
     */
    @TableField("CREATED_TIME")
    private Date createdTime;


}
