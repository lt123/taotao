package com.taotao.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.taotao.common.dao.IBaseDao;
import com.taotao.common.page.PageResult;
import com.taotao.common.service.IBaseService;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/5/3.
 */
public class BaseServiceImpl<T,PK> implements IBaseService<T,PK> {

    @Autowired
    private IBaseDao<T,PK> baseDao;

    @Override
    public T getById(PK id) {
        return baseDao.getById(id);
    }

    @Override
    @Transactional
    public void deleteById(PK id) {
        baseDao.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteByIds(String ids) {
        List<Integer> list = new ArrayList<>();
        String[] id = ids.split(",");
        for (String s : id) {
            list.add(Integer.parseInt(s));
        }
        baseDao.deleteByIds(list);
    }

    @Override
    @Transactional
    public void update(T t) {
        baseDao.update(t);
    }

    @Override
    @Transactional
    public T save(T t) {
        baseDao.save(t);
        return t;
    }

    @Override
    public List<T> getByCondition(Map<String, Object> map) {
        return baseDao.getByCondition(map);
    }

    @Override
    public Integer getCountByCondition(Map<String,Object> map){
        return baseDao.getCountByCondition(map);
    }

    @Override
    public PageResult<T> getPageResult(Map<String, Object> map) {
        Integer currentPage = map.get("currentPage") == null ? 1:Integer.parseInt(map.get("currentPage").toString());
        Integer pageSize = map.get("pageSize") == null ? 10:Integer.parseInt(map.get("pageSize").toString());
        map.put("currentPage",(currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        Integer count = baseDao.getCountByCondition(map);
        List<T> rows = baseDao.getByCondition(map);
        return new PageResult<T>(currentPage,pageSize,count,rows);
    }
}
