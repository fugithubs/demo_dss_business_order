package com.dss.order.service;

import com.dss.order.domain.WaterExample;
import com.dss.order.domain.Water;
import java.util.List;
public interface WaterService{


    long countByExample(WaterExample example);

    int deleteByExample(WaterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Water record);

    int insertSelective(Water record);

    List<Water> selectByExample(WaterExample example);

    Water selectByPrimaryKey(Integer id);

    int updateByExampleSelective(Water record,WaterExample example);

    int updateByExample(Water record,WaterExample example);

    int updateByPrimaryKeySelective(Water record);

    int updateByPrimaryKey(Water record);

}
