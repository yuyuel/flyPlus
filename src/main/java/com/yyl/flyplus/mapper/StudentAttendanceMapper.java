package com.yyl.flyplus.mapper;

import com.yyl.flyplus.model.StudentAttendance;

public interface StudentAttendanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentAttendance record);

    int insertSelective(StudentAttendance record);

    StudentAttendance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentAttendance record);

    int updateByPrimaryKey(StudentAttendance record);
}