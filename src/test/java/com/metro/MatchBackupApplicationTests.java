package com.metro;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MatchBackupApplicationTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    final static String  DIR_PATH = "E:\\metor_cloud\\";

    @Test
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


    public void contextLoads2() {
        String sql = "select * from BOM_BUS_EXCEPTION";
        List result = jdbcTemplate.query(sql, new RowMapper<Map>() {
            @Override
            public Map mapRow(ResultSet rs, int rowNum) throws SQLException {
                Map row = new HashMap();
                row.put(rs.getInt("CARD_NO"), rs.getString("SEQ_NO"));
                return row;
            }});
        System.out.println(result.size());
    }



}
