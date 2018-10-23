package com.gxwuz.ly.shetuan.action;

import com.gxwuz.ly.shetuan.entity.Permission;
import com.gxwuz.ly.shetuan.entity.PermissionKey;
import com.gxwuz.ly.shetuan.entity.ResponseData;
import com.gxwuz.ly.shetuan.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    PermissionService permissionService;

    @RequestMapping("/add")
    public ResponseData<Permission> add(String stuNo, Integer roleId) {
        ResponseData<Permission> response = new ResponseData<>();
        try {
            Permission permission = new Permission();
            permission.setId(new PermissionKey(stuNo,roleId));
            permissionService.save(permission);
            response.setCode(1);
            response.setMsg("保存成功!");
        } catch (Exception e) {
            response.setCode(0);
            response.setMsg("保存出错!");
            e.printStackTrace();
        }
        return response;
    }

    @RequestMapping("/delete")
    public ResponseData<Permission> delete(Integer permissonId) {
        ResponseData<Permission> response = new ResponseData<>();
        try {
            permissionService.delete(permissonId);
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
    public ResponseData<Permission> update(Permission permission) {
        ResponseData<Permission> response = new ResponseData<>();
        try {
            permissionService.update(permission);
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
    public ResponseData<Permission> get(Integer permissionId) {
        ResponseData<Permission> response = new ResponseData<>();
        try {
            List<Permission> permissions = new ArrayList<>();
            Permission permission =  permissions.get(permissionId);
            permissions.add(permission);
            response.setCode(1);
            response.setDatas(permissions);
            response.setMsg("查询成功!");
        } catch (Exception e) {
            response.setCode(0);
            response.setMsg("查询失败!");
            e.printStackTrace();
        }
        return response;
    }

    @RequestMapping("/getListByPage")
    public ResponseData<Permission> getListByPage(Integer page, Integer pageSize) {
        ResponseData<Permission> response = new ResponseData<>();
        try {
            Page<Permission> permissions =  permissionService.getListByPage(page-1, pageSize);
            response.setCode(1);
            response.setDatas(permissions);
            response.setMsg("查询成功!");
        } catch (Exception e) {
            response.setCode(0);
            response.setMsg("查询失败!");
            e.printStackTrace();
        }
        return response;
    }

}
