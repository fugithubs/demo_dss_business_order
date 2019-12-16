package com.dss.order.service.impl;

import com.dss.order.service.UsersService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dss.order.domain.UsersExample;
import com.dss.order.domain.Users;
import com.dss.order.mapper.UsersMapper;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public long countByExample(UsersExample example) {
        return usersMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersExample example) {
        return usersMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public int insertSelective(Users record) {
        return usersMapper.insertSelective(record);
    }

    @Override
    public List<Users> selectByExample(UsersExample example) {
        return usersMapper.selectByExample(example);
    }

    @Override
    public Users selectByPrimaryKey(Long id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Users record,UsersExample example) {
        return usersMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Users record,UsersExample example) {
        return usersMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }

}
