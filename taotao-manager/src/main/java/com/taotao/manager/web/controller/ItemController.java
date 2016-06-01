package com.taotao.manager.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.page.PageResult;
import com.taotao.common.util.MapUtil;
import com.taotao.manager.model.Item;
import com.taotao.manager.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	@ResponseBody
	public PageResult<Item> list(Integer page,Integer rows) {
		return itemService.getPageResult(MapUtil.createMap("currentPage",page,"pageSize",rows));
	}
	
}
