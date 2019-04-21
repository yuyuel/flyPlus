package com.yyl.flyplus.mapper;

import com.yyl.flyplus.model.TeacherAttendance;

public interface TeacherAttendanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherAttendance record);

    int insertSelective(TeacherAttendance record);

    TeacherAttendance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherAttendance record);

    int updateByPrimaryKey(TeacherAttendance record);
}