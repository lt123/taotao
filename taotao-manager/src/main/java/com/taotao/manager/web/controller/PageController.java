package com.taotao.manager.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public Map<String,Object> testname(String id){
		System.out.println("PageController.testname()" + id);
		Map<String,Object> m = new HashMap<>();
		m.put("key", "username");
		return m;
	}
}
  