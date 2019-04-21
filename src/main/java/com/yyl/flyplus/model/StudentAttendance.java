package com.yyl.flyplus.model;

public class StudentAttendance {
    private Integer id;

    private Integer teacherAttendanceId;

    private String studentName;

    private Byte type;

    private Integer rollCallTime;

    private Integer studentId;

    private Integer createTime;

    private Integer updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherAttendanceId() {
        return teacherAttendanceId;
    }

    public void setTeacherAttendanceId(Integer teacherAttendanceId) {
        this.teacherAttendanceId = teacherAttendanceId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getRollCallTime() {
        return rollCallTime;
    }

    public void setRollCallTime(Integer rollCallTime) {
        this.rollCallTime = rollCallTime;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}