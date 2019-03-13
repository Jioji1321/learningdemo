package com.jerry.car.entity.user;

import java.io.Serializable;

public class UserLogin implements Serializable{

    private Integer loginId;

    private String loginName;

    private String loginPassword;

    public UserLogin() {    }

    public UserLogin(Integer loginId, String loginName, String loginPassword) {
        this.loginId = loginId;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
}
