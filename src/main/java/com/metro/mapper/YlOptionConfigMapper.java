package com.metro.mapper;

import com.metro.entity.YlOptionConfig;
import com.metro.entity.YlOptionConfigExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YlOptionConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    int countByExample(YlOptionConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    int deleteByExample(YlOptionConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    int insert(YlOptionConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    int insertSelective(YlOptionConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    List<YlOptionConfig> selectByExample(YlOptionConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    YlOptionConfig selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YlOptionConfig record, @Param("example") YlOptionConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YlOptionConfig record, @Param("example") YlOptionConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YlOptionConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YL_OPTION_CONFIG
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YlOptionConfig record);
}