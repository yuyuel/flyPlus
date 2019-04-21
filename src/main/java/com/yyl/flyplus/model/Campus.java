package com.yyl.flyplus.model;

public class Campus {
    private Integer id;

    private Integer campusNum;

    private String campusName;

    private String principal;

    private String phone;

    private String projectId;

    private Boolean campusLevel;

    private String address;

    private Integer schoolId;

    private String headCampus;

    private Boolean isDel;

    private Integer createTime;

    private Integer updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCampusNum() {
        return campusNum;
    }

    public void setCampusNum(Integer campusNum) {
        this.campusNum = campusNum;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName == null ? null : campusName.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public Boolean getCampusLevel() {
        return campusLevel;
    }

    public void setCampusLevel(Boolean campusLevel) {
        this.campusLevel = campusLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getHeadCampus() {
        return headCampus;
    }

    public void setHeadCampus(String headCampus) {
        this.headCampus = headCampus == null ? null : headCampus.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
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