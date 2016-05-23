package com.taotao.manager.dao;

import org.springframework.stereotype.Repository;

import com.taotao.common.dao.IBaseDao;
import com.taotao.manager.model.User;

/**
 * ClassName:IUserDao
 * Function: TODO
 * Reason:   TODO
 * Date:     2016-5-23 上午11:18:53
 * @author   litao
 * @version  V1.0  
 * @see       
 */
@Repository
public interface IUserDao extends IBaseDao<User, Long> {
	
}
  