package com.gxwuz.ly.shetuan.dao;

import com.gxwuz.ly.shetuan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface UserRepository extends JpaRepository<User, Serializable> {
    User findUserByStuNoAndPwd(String stuNo, String pwd);
}
