package com.taotao.manager.service;

import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.service.IBaseService;
import com.taotao.manager.model.Item;

/**
 * Created by admin on 2016/5/3.
 */
public interface ItemService extends IBaseService<Item,Long> {

	public String upload(MultipartFile uploadFile);
	
}
