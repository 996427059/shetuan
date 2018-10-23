package com.gxwuz.ly.shetuan.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

/**
 *   用户
 */
@Entity
@Table(name = "user")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class User extends BaseModel{
    @Id
    private String stuNo;

    @Column
    private String fullName;

    @Column
    private String pwd;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stuNo")
    private PersonInfo info;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "stuNo")
    private Set<Permission> permission;      // 该用户所有的角色

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "shetuanId")
    private Set<Shetuan> joins;                //该用户参加过的社团

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Set<Permission> getPermission() {
        return permission;
    }

    public void setPermission(Set<Permission> permission) {
        this.permission = permission;
    }

    public Set<Shetuan> getJoins() {
        return joins;
    }

    public void setJoins(Set<Shetuan> joins) {
        this.joins = joins;
    }
}
