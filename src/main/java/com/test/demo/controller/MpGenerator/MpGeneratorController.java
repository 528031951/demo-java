package com.test.demo.controller.MpGenerator;

import com.test.demo.constants.StatusCode;
import com.test.demo.utli.CheckObjectIsEmpty;
import com.test.demo.utli.MpGenerator;
import com.test.demo.utli.Result;
import com.test.demo.vo.MpGeneratorVo;
import org.springframework.web.bind.annotation.*;


/**
 * @description: mybatis-plus代码生成器controller
 * @author: 韩明华
 * @create: 2020-05-15 11:39
 **/
@RestController
@RequestMapping("/api/mp-generator")
public class MpGeneratorController {

    /***
    * @Description: mybatis-plus代码生成器
    * @Param: mpGeneratorVo
    * @return: com.test.demo.utli.Result
    * @Author: 韩明华
    * @Date: 2020/5/15
    */
    @PostMapping("/save-mp-generator")
    public Result saveMpGenerator(@RequestBody MpGeneratorVo mpGeneratorVo){
        if(CheckObjectIsEmpty.checkStringIsNull(mpGeneratorVo.getAuthor(),mpGeneratorVo.getInclude(),
                mpGeneratorVo.getOutputDir(),mpGeneratorVo.getPassword(),
                mpGeneratorVo.getUsername(),mpGeneratorVo.getUrl())){
            return Result.errorMsg(StatusCode.PARAM_ERROR.getCode(),StatusCode.PARAM_ERROR.getMsg());
        }
        new MpGenerator().myBatisGeneratorRun(mpGeneratorVo);
        return Result.success("生成成功");
    }
}
