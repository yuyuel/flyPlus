package com.yyl.flyplus.model;

public class TeacherAttendance {
    private Integer id;

    private Integer teacherId;

    private Integer shouldArrive;

    private Integer attendClass;

    private Integer leave;

    private Integer late;

    private Integer truancy;

    private Integer leaveEarly;

    private Integer createTime;

    private Integer updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getShouldArrive() {
        return shouldArrive;
    }

    public void setShouldArrive(Integer shouldArrive) {
        this.shouldArrive = shouldArrive;
    }

    public Integer getAttendClass() {
        return attendClass;
    }

    public void setAttendClass(Integer attendClass) {
        this.attendClass = attendClass;
    }

    public Integer getLeave() {
        return leave;
    }

    public void setLeave(Integer leave) {
        this.leave = leave;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getTruancy() {
        return truancy;
    }

    public void setTruancy(Integer truancy) {
        this.truancy = truancy;
    }

    public Integer getLeaveEarly() {
        return leaveEarly;
    }

    public void setLeaveEarly(Integer leaveEarly) {
        this.leaveEarly = leaveEarly;
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