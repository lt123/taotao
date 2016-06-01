package com.taotao.manager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.model.EasyUiTreeNode;
import com.taotao.common.service.impl.BaseServiceImpl;
import com.taotao.common.util.MapUtil;
import com.taotao.manager.dao.ItemCatDao;
import com.taotao.manager.model.ItemCat;
import com.taotao.manager.service.ItemCatService;

@Service
public class ItemCatServiceImpl extends BaseServiceImpl<ItemCat,Long> implements ItemCatService {
	
	@Autowired
	private ItemCatDao itemDao;

	@Override
	public List<EasyUiTreeNode> getTreeNode(Long parentId) {
		List<ItemCat> itemCats = itemDao.getByCondition(MapUtil.createMap("parentId",parentId));
		if(itemCats != null && itemCats.size() > 0) {
			List<EasyUiTreeNode> easyUiTreeNodes = new ArrayList<>();
			for (ItemCat itemCat : itemCats) {
				EasyUiTreeNode node = new EasyUiTreeNode();
				node.setId(itemCat.getId());
				node.setText(itemCat.getName());
				// 该类目是否为父类目，1为true，0为false
				node.setState(itemCat.getIsParent() == 1L ? "closed":"open");
				easyUiTreeNodes.add(node);
			}
			return easyUiTreeNodes;
		}
		return null;
	}

}
