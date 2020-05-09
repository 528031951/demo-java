package com.test.demo.utli;

/**
 * @author TriggerWu
 * @version 1.0.0
 * @ClassName CheckObjectIsEmpty.java
 * @Description 判空(适用于任何类型)
 * @createTime 2019年10月30日 16:43:00
 */
public class CheckObjectIsEmpty {

    /**
     *    检查是否为 null
     * @Param: [value] 需要验证的多个字符，以英文逗号分隔
     * @Return: boolean
     * @Author: 韩明华
     * @Date: 2019/11/26 14:36
     */
    public static boolean checkStringIsNull(Object... value){
        int count = 0;
        for(int i=0;i<value.length;i++){
            //遍历字符数组所有的参数，发现某个为 null 或者 "" ,则跳出
            if("".equals(value[i]) || null==value[i]){
                return true;
            }
            count++;
        }
        if(count == value.length){
            return false;
        }
        return true;
    }
}


