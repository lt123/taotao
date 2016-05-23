package com.taotao.common.service;

import java.util.List;
import java.util.Map;

import com.taotao.common.page.PageResult;


/**
 * ClassName:IBaseService
 * Function: 公共service封装
 * Reason:   TODO
 * Date:     2016-5-23 上午11:20:37
 * @author   litao
 * @version  V1.0  
 * @see       
 */
public interface IBaseService<T,PK> {

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    public T getById(PK id);

    /**
     * 根据id删除数据
     * @param id
     */
    public void deleteById(PK id);

    /**
     * 根据多个id删除数据
     * @param ids
     */
    public void deleteByIds(String ids);

    /**
     * 根据对象修改对象
     * @param t
     */
    public void update(T t);

    /**
     * 保存对象并返回对象
     * @param t
     * @return
     */
    public T save(T t);


    /**
     * 根据条件查询  并返回list
     * @param map
     * @return
     */
    public List<T> getByCondition(Map<String,Object> map);

    /**
     * 根据条件查询总条数
     * @param map
     * @return
     */
    public Integer getCountByCondition(Map<String,Object> map);

    /**
     * 获取分页返回的数据
     * @return
     */
    public PageResult<T> getPageResult(Map<String,Object> map);
}
  