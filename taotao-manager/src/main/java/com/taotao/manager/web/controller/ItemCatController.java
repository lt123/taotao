package com.taotao.manager.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.model.EasyUiTreeNode;
import com.taotao.manager.service.ItemCatService;

@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
	
	@Autowired
	private ItemCatService itemCatService;
	
	@RequestMapping(value = "/list")
	@ResponseBody
	public List<EasyUiTreeNode> list(@RequestParam(value="id",defaultValue = "0")Long parentId) {
		return itemCatService.getTreeNode(parentId);
	}
	
}
