package com.metro.unit;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisPlusGenerateUnit {
    final static String  DIR_PATH = "E:\\metor_cloud\\";
    public void contextLoads() {
        AutoGenerator mpg = new AutoGenerator();


        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(DIR_PATH);
        gc.setAuthor("wangwei");//作者
        gc.setFileOverride(true); //是否覆盖
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList

        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.ORACLE)
                .setUrl("jdbc:oracle:thin:@61.183.232.58:8521:oraletest")
                .setUsername("iafc_dev")
                .setPassword("iafc123")
                .setDriverName("oracle.jdbc.driver.OracleDriver");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(new String[] { "ACTIVEMQ_MSGS"}); // 需要生成的表
        //strategy.setExclude(new String[]{"all_family"}); // 排除生成的表
        strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com");
        pc.setModuleName("metro");
        pc.setController("controler");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        pc.setXml("mapperXml");

        mpg.setPackageInfo(pc);

        mpg.execute();
    }

    public static void main(String[] args) {
        MybatisPlusGenerateUnit t = new MybatisPlusGenerateUnit();
        t.contextLoads();
    }
}
