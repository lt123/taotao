package com.taotao.manager.service;

import java.util.List;

import com.taotao.common.model.EasyUiTreeNode;
import com.taotao.common.service.IBaseService;
import com.taotao.manager.model.ItemCat;

/**
 * Created by admin on 2016/5/3.
 */
public interface ItemCatService extends  IBaseService<ItemCat,Long> {
	public List<EasyUiTreeNode> getTreeNode(Long parentId);
}
