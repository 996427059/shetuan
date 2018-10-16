package com.gxwuz.ly.shetuan.action;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gxwuz.ly.shetuan.entity.User;
import com.gxwuz.ly.shetuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Page<User> hello(){

        Page<User> page = userService.getListByPage(0, 5);

        return page;
    }
}
