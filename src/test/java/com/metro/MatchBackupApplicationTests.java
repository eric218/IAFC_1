package com.metro;

import com.metro.mapper.YlDealInMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MatchBackupApplicationTests {
    @Autowired
    private YlDealInMapper ylDealInMapper;

    @Test
    public void contextLoads() {
        ylDealInMapper.deleteByPrimaryKey("ss");
    }


}
