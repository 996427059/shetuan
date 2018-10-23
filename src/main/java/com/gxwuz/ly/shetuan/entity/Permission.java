package com.gxwuz.ly.shetuan.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 *  权限类
 *  关联  用户表  与  权限表
 */
@Entity
@Table(name = "permission")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Permission extends BaseModel {

    @EmbeddedId
    private PermissionKey id;

    public PermissionKey getId() {
        return id;
    }

    public void setId(PermissionKey id) {
        this.id = id;
    }
}
