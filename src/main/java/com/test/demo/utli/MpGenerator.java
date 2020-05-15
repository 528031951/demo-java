package com.test.demo.utli;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.test.demo.vo.MpGeneratorVo;

/**
 * @description: mybatis-plus代码生成器
 * @author: 韩明华
 * @create: 2020-05-14 16:05
 **/
public class MpGenerator {
    /***
    * @Description: 代码生成器
    * @Param: [outputDir(文件路径名称), author(创建人), url(数据库连接地址), username(数据库账号), password(数据库密码), include(生成实体表名称)]
    * @return: void
    * @Author: 韩明华
    * @Date: 2020/5/15
    */
    public void myBatisGeneratorRun(MpGeneratorVo mpGeneratorVo){
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(mpGeneratorVo.getOutputDir());
        gc.setAuthor(mpGeneratorVo.getAuthor());
        gc.setOpen(false);   //生成后是否打开资源管理器
        gc.setFileOverride(false);  //重新生产代码是否进行覆盖原先代码
        gc.setDateType(DateType.ONLY_DATE);    //定义生成实体类中实体日期类型
        gc.setSwagger2(false); //开启swagger
        gc.setServiceName("%sService");   //去掉service接口的首字母l
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        // 默认service接口名IXXXService 自定义指定之后就不会用I开头了
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);

        //配置 DataSourceConfig
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/"+mpGeneratorVo.getUrl()+"?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8");
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername(mpGeneratorVo.getUsername());
        dataSourceConfig.setPassword(mpGeneratorVo.getPassword());
        dataSourceConfig.setDbType(DbType.MYSQL);
        mpg.setDataSource(dataSourceConfig);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.test");
        pc.setModuleName("demo");  //生成出来为：com.ss_hz.edu
        pc.setController("controller").setEntity("model").setMapper("dao").setService("service").setXml("mapper.xml").setServiceImpl("service.impl");
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude(mpGeneratorVo.getInclude());  //数据库表名称（多个已逗号隔开）
        strategy.setNaming(NamingStrategy.underline_to_camel);   //数据库表映射到实体的命名策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setTablePrefix(pc.getModuleName() + "_");   //生产实体时去掉表前缀
        strategy.setEntityLombokModel(true);  //lombok模型。用于链式编程操作
        strategy.setRestControllerStyle(true);  //restful  api风格控制器
        strategy.setControllerMappingHyphenStyle(true);  //url中驼峰转换字符
        mpg.setStrategy(strategy);

        // 这个是必要的,否则程序会报空指针异常 参见
        // com.baomidou.mybatisplus.generator.engine.AbstractTemplateEngine.getObjectMap 的结尾
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
            }
        };
        mpg.setCfg(cfg);
        mpg.execute();
    }

}
