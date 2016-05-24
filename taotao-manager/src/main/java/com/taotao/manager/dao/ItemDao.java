package com.taotao.manager.dao;

import org.springframework.stereotype.Repository;

import com.taotao.common.dao.IBaseDao;
import com.taotao.manager.model.Item;

@Repository
public interface ItemDao extends IBaseDao<Item, Long> {
	
}
  