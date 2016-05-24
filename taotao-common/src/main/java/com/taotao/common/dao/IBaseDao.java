package com.taotao.common.dao;

import java.util.List;
import java.util.Map;

/**
 * 所有dao的公共方法
 * @param <T>  model类型
 * @param <PK>  主键类型
 */
public interface IBaseDao<T,PK> {
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
    public void deleteByIds(List<Integer> ids);

    /**
     * 根据对象修改对象
     * @param t
     */
    public void update(T t);

    /**
     * 保存对象
     * @param t
     */
    public void save(T t);


    /**
     * 根据条件查询  并返回list
     * @param map
     * @return
     */
    public List<T> getByCondition(Map<String,Object> map);

    /**
     * 根据条件查询总数
     * @param map
     * @return
     */
    Integer getCountByCondition(Map<String, Object> map);
}
  