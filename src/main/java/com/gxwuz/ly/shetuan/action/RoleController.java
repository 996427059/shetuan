package com.gxwuz.ly.shetuan.action;

import com.gxwuz.ly.shetuan.entity.ResponseData;
import com.gxwuz.ly.shetuan.entity.Role;
import com.gxwuz.ly.shetuan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController extends BaseController {

    @Autowired
    RoleService roleService;

    @RequestMapping("/add")
    public ResponseData<Role> add(Role role) {
        ResponseData<Role> response = new ResponseData<>();
        try {
            roleService.save(role);
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
    public ResponseData<Role> delete(Integer roleId) {
        ResponseData<Role> response = new ResponseData<>();
        try {
            roleService.delete(roleId);
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
    public ResponseData<Role> update(Role role) {
        ResponseData<Role> response = new ResponseData<>();
        try {
            roleService.update(role);
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
    public ResponseData<Role> get(Integer roleId) {
        ResponseData<Role> response = new ResponseData<>();
        try {
            List<Role> roles = new ArrayList<>();
            Role role =  roleService.get(roleId);
            roles.add(role);
            response.setCode(1);
            response.setDatas(roles);
            response.setMsg("查询成功!");
        } catch (Exception e) {
            response.setCode(0);
            response.setMsg("查询失败!");
            e.printStackTrace();
        }
        return response;
    }

    @RequestMapping("/getUsersByPage")
    public ResponseData<Role> getUsersByPage(Integer page, Integer pageSize) {
        ResponseData<Role> response = new ResponseData<>();
        try {
            Page<Role> roles =  roleService.getListByPage(page, pageSize);
            response.setCode(1);
            response.setDatas(roles);
            response.setMsg("查询成功!");
        } catch (Exception e) {
            response.setCode(0);
            response.setMsg("查询失败!");
            e.printStackTrace();
        }
        return response;
    }
}
