package com.gxwuz.ly.shetuan.service;

import com.gxwuz.ly.shetuan.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService extends BaseService<User> {
    User login(String stuNo, String pwd);

}
