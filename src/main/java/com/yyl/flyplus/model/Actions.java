package com.yyl.flyplus.model;

public class Actions {
    private Integer id;

    private String action;

    private String mathond;

    private String controller;

    private String content;

    private Integer userId;

    private String userIp;

    private Integer actiontime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getMathond() {
        return mathond;
    }

    public void setMathond(String mathond) {
        this.mathond = mathond == null ? null : mathond.trim();
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller == null ? null : controller.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public Integer getActiontime() {
        return actiontime;
    }

    public void setActiontime(Integer actiontime) {
        this.actiontime = actiontime;
    }
}