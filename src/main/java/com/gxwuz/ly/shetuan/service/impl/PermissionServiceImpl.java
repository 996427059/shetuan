package com.gxwuz.ly.shetuan.service.impl;

import com.gxwuz.ly.shetuan.dao.PermissionRepository;
import com.gxwuz.ly.shetuan.entity.Permission;
import com.gxwuz.ly.shetuan.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionRepository permissionRepository;

    @Override
    public void save(Permission entity) {
        permissionRepository.saveAndFlush(entity);
    }

    @Override
    public void delete(Serializable id) {
        permissionRepository.delete(this.get(id));
    }

    @Override
    public void deleteList(Iterable<Permission> list) {
        permissionRepository.deleteAll(list);
    }

    @Override
    public void update(Permission entity) {
        permissionRepository.saveAndFlush(entity);
    }

    @Override
    public Permission get(Serializable id) {
        return permissionRepository.getOne(id);
    }

    @Override
    public List<Permission> getAll() {
        return permissionRepository.findAll();
    }

    @Override
    public Page<Permission> getListByPage(Integer page, Integer pageSize) {
        return permissionRepository.findAll(PageRequest.of(page, pageSize));
    }

    @Override
    public Long count() {
        return permissionRepository.count();
    }
}
