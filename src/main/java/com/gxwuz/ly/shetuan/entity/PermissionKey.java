package com.gxwuz.ly.shetuan.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PermissionKey implements Serializable {

    public PermissionKey() {
    }

    public PermissionKey(String stuNo, Integer roleId) {
        this.stuNo = stuNo;
        this.roleId = roleId;
    }

    @Column
    private String stuNo;

    @Column
    private Integer roleId;


    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermissionKey that = (PermissionKey) o;
        return Objects.equals(stuNo, that.stuNo) &&
                Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuNo, roleId);
    }

    @Override
    public String toString() {
        return "PermissionKey{" +
                "stuNo='" + stuNo + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
