package com.gxwuz.ly.shetuan.service.impl;

import com.gxwuz.ly.shetuan.dao.RoleRepository;
import com.gxwuz.ly.shetuan.entity.Role;
import com.gxwuz.ly.shetuan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void save(Role entity) {
        roleRepository.saveAndFlush(entity);
    }

    @Override
    public void delete(Serializable id) {
        roleRepository.deleteById(id);
    }

    @Override
    public void deleteList(Iterable<Role> list) {
        roleRepository.deleteAll(list);
    }

    @Override
    public void update(Role entity) {
        roleRepository.saveAndFlush(entity);
    }

    @Override
    public Role get(Serializable id) {
        return roleRepository.getOne(id);
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Page<Role> getListByPage(Integer page, Integer pageSize) {
        return roleRepository.findAll(PageRequest.of(page, pageSize));
    }

    @Override
    public Long count() {
        return roleRepository.count();
    }
}
