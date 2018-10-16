package com.gxwuz.ly.shetuan.service;

import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {

    void save(T entity);

    void delete(Serializable id);

    void deleteList(Iterable<T> list);

    void update(T entity);

    T get(Serializable id);

    List<T> getAll();

    Page<T> getListByPage(Integer page, Integer pageSize);

    Long count();
}
