package com.jerry.car.entity.user;

import java.io.Serializable;

public class UserRole implements Serializable{

    private Integer roleId;

    private Integer roleName;

    public UserRole() {    }

    public UserRole(Integer roleId, Integer roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRoleName() {
        return roleName;
    }

    public void setRoleName(Integer roleName) {
        this.roleName = roleName;
    }
}
