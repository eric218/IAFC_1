package com.metro.mapper;

import com.metro.entity.YlDealIn;
import com.metro.entity.YlDealInExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface YlDealInMapper {
    int countByExample(YlDealInExample example);

    int deleteByExample(YlDealInExample example);

    int deleteByPrimaryKey(String eventNo);

    int insert(YlDealIn record);

    int insertSelective(YlDealIn record);

    List<YlDealIn> selectByExample(YlDealInExample example);

    YlDealIn selectByPrimaryKey(String eventNo);

    int updateByExampleSelective(@Param("record") YlDealIn record, @Param("example") YlDealInExample example);

    int updateByExample(@Param("record") YlDealIn record, @Param("example") YlDealInExample example);

    int updateByPrimaryKeySelective(YlDealIn record);

    int updateByPrimaryKey(YlDealIn record);
}