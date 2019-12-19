package com.dss.order.mapper;

import com.dss.order.domain.Student;
import com.dss.order.domain.StudentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /***************以下为自定义方法自动生产xml配置*******************/

    List<Student> findAllByStunameLike(@Param("likeStuname") String likeStuname);

    int insertList(@Param("list") List<Student> list);

    int updateById(@Param("updated")Student updated,@Param("id")Integer id);

    int deleteByStuname(@Param("stuname")String stuname);



}