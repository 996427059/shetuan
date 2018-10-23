package com.gxwuz.ly.shetuan.action;

import com.gxwuz.ly.shetuan.entity.ResponseData;
import com.gxwuz.ly.shetuan.entity.User;
import com.gxwuz.ly.shetuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController extends BaseController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public ResponseData<User> login(String stuNo, String pwd, User u) {

        logger.info("我我我登录-----");
        ResponseData<User> response = new ResponseData<>();
        try {
            List<User> users = new ArrayList<>();
            User user =  userService.login(stuNo, pwd);
            logger.info("查询结果"+stuNo + " "+ pwd + " " +u);
            if (user != null) {
                users.add(user);
                response.setCode(1);
                response.setDatas(users);
                response.setMsg("登录成功!");
            }else {
                response.setCode(0);
                response.setMsg("登录失败!");
            }
        } catch (Exception e) {
            response.setCode(0);
            response.setMsg("登录失败!");
            e.printStackTrace();
        }
        return response;

    }
}
