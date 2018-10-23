package com.gxwuz.ly.shetuan.dao;

import com.gxwuz.ly.shetuan.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;


public interface PermissionRepository extends JpaRepository<Permission, Serializable> {
}
