package com.dss.order.mapper;

import com.dss.order.domain.Water;
import com.dss.order.domain.WaterExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WaterMapper {
    long countByExample(WaterExample example);

    int deleteByExample(WaterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Water record);

    int insertSelective(Water record);

    List<Water> selectByExample(WaterExample example);

    Water selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Water record, @Param("example") WaterExample example);

    int updateByExample(@Param("record") Water record, @Param("example") WaterExample example);

    int updateByPrimaryKeySelective(Water record);

    int updateByPrimaryKey(Water record);
}