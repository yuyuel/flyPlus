package com.yyl.flyplus.mapper;

import com.yyl.flyplus.model.StudentClass;

public interface StudentClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentClass record);

    int insertSelective(StudentClass record);

    StudentClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentClass record);

    int updateByPrimaryKey(StudentClass record);
}