package com.dss.order.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.dss.order.domain.WaterExample;
import com.dss.order.domain.Water;
import java.util.List;
import com.dss.order.mapper.WaterMapper;
import com.dss.order.service.WaterService;
@Service
public class WaterServiceImpl implements WaterService{

    @Resource
    private WaterMapper waterMapper;

    @Override
    public long countByExample(WaterExample example) {
        return waterMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(WaterExample example) {
        return waterMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return waterMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Water record) {
        return waterMapper.insert(record);
    }

    @Override
    public int insertSelective(Water record) {
        return waterMapper.insertSelective(record);
    }

    @Override
    public List<Water> selectByExample(WaterExample example) {
        return waterMapper.selectByExample(example);
    }

    @Override
    public Water selectByPrimaryKey(Integer id) {
        return waterMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Water record,WaterExample example) {
        return waterMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Water record,WaterExample example) {
        return waterMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Water record) {
        return waterMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Water record) {
        return waterMapper.updateByPrimaryKey(record);
    }

}
