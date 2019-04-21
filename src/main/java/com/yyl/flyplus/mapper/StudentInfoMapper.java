package com.yyl.flyplus.mapper;

import com.yyl.flyplus.model.StudentInfo;

public interface StudentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}