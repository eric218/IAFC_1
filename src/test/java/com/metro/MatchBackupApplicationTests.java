package com.metro;

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
    @Test
    public void contextLoads() {
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
