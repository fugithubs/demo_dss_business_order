package com.dss.order.service;

import com.dss.order.domain.Users;
import com.dss.order.domain.UsersExample;

import java.util.List;

public interface UsersService {


    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Long id);

    int updateByExampleSelective(Users record, UsersExample example);

    int updateByExample(Users record, UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

}
