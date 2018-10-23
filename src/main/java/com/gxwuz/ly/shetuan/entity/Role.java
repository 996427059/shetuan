package com.gxwuz.ly.shetuan.entity;

import javax.persistence.*;

/**
 *   角色类
 *
 */
@Entity
@Table(name = "role")
public class Role extends BaseModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer roleId;

    @Column
    private String roleName;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
