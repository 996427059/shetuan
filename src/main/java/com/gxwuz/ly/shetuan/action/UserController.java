package com.gxwuz.ly.shetuan.action;

import com.gxwuz.ly.shetuan.entity.ResponseData;
import com.gxwuz.ly.shetuan.entity.User;
import com.gxwuz.ly.shetuan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    UserService userService;


    @RequestMapping("/add")
    public ResponseData<User> add(User user){
        ResponseData<User> response = new ResponseData<>();
        try {
            userService.save(user);
            response.setCode(1);
            response.setMsg("保存成功!");
        } catch (Exception e){
            response.setCode(0);
            response.setMsg("保存出错!");
            e.printStackTrace();
        }
        return response;
    }

    @RequestMapping("/delete")
    public ResponseData<User> delete(String stuNo) {
        ResponseData<User> response = new ResponseData<>();

        try {
            userService.delete(stuNo);
            response.setCode(1);
            response.setMsg("删除成功!");
        } catch (Exception e) {
            response.setCode(0);
            response.setMsg("删除失败!");
            e.printStackTrace();
        }
        return response;
    }

    @RequestMapping("/update")
    public ResponseData<User> update(User user) {
        ResponseData<User> response = new ResponseData<>();
        try {
            userService.update(user);
            response.setCode(1);
            response.setMsg("修改成功!");
        } catch (Exception e) {
            response.setCode(0);
            response.setMsg("修改失败!");
            e.printStackTrace();
        }
        return response;
    }

    @RequestMapping("/get")
    public ResponseData<User> get(String stuNo) {
        ResponseData<User> response = new ResponseData<>();
        try {
            List<User> users = new ArrayList<>();
            User user =  userService.get(stuNo);
            users.add(user);
            response.setCode(1);
            response.setDatas(users);
            response.setMsg("查询成功!");
        } catch (Exception e) {
            response.setCode(0);
            response.setMsg("查询失败!");
            e.printStackTrace();
        }
        return response;
    }

    @RequestMapping("/getUsersByPage")
    public ResponseData<User> getUsersByPage(Integer page, Integer pageSize) {
        ResponseData<User> response = new ResponseData<>();
        try {
            Page<User> users =  userService.getListByPage(page-1, pageSize);
            response.setCode(1);
            response.setDatas(users);
            response.setMsg("查询成功!");
        } catch (Exception e) {
            response.setCode(0);
            response.setMsg("查询失败!");
            e.printStackTrace();
        }
        return response;
    }

}
