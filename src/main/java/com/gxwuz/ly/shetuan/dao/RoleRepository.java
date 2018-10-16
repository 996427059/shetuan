package com.gxwuz.ly.shetuan.dao;

import com.gxwuz.ly.shetuan.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface RoleRepository extends JpaRepository<Role, Serializable> {
}
