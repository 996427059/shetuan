package com.gxwuz.ly.shetuan.service.impl;


import com.gxwuz.ly.shetuan.dao.UserRepository;
import com.gxwuz.ly.shetuan.entity.User;
import com.gxwuz.ly.shetuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public void save(User entity) {
        userRepository.saveAndFlush(entity);
    }

    @Override
    public void delete(Serializable id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteList(Iterable<User> list) {
        userRepository.deleteAll(list);
    }

    @Override
    public void update(User entity) {
        userRepository.saveAndFlush(entity);
    }

    @Override
    public User get(Serializable id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> getListByPage(Integer page, Integer pageSize) {
        return userRepository.findAll(PageRequest.of(page, pageSize));
    }

    @Override
    public Long count() {
        return userRepository.count();
    }

    @Override
    public User login(String stuNo, String pwd) {
        return userRepository.findUserByStuNoAndPwd(stuNo,pwd);
    }
}
