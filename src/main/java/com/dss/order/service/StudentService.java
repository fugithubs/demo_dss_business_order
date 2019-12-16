package com.dss.order.service;

import java.util.List;
import com.dss.order.domain.StudentExample;
import com.dss.order.domain.Student;

public interface StudentService {


    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(Student record, StudentExample example);

    int updateByExample(Student record, StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}

