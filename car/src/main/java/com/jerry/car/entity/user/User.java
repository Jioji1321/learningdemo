package com.jerry.car.entity.user;

import java.io.Serializable;

public class User implements Serializable{

    private Integer userId;

    private UserInformation information;

    private UserLogin login;

    private UserRole role;

    public User(Integer userId, UserInformation information, UserLogin login, UserRole role) {
        this.userId = userId;
        this.information = information;
        this.login = login;
        this.role = role;
    }

    public User() { }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public UserInformation getInformation() {
        return information;
    }

    public void setInformation(UserInformation information) {
        this.information = information;
    }

    public UserLogin getLogin() {
        return login;
    }

    public void setLogin(UserLogin login) {
        this.login = login;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
