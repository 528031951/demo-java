package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * test_user
 * @author 
 */
@Data
public class TestUser implements Serializable {
    /**
     * 角色表主键
     */
    private String id;

    /**
     * 角色编码
     */
    private String userCode;

    /**
     * 密码
     */
    private String pssword;

    /**
     * 是否禁用（0：否，1：是）
     */
    private Integer isDisabled;

    private static final long serialVersionUID = 1L;
}