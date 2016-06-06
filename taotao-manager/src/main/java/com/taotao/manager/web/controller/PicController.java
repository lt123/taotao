package com.taotao.manager.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.taotao.manager.service.ItemService;

@Controller
@RequestMapping("/pic")
public class PicController {
	
	@Autowired
	private ItemService itemService;

	@RequestMapping("/upload")
	@ResponseBody
	public String upload(MultipartFile uploadFile) {
		return itemService.upload(uploadFile);
	}
	
	/*@RequestMapping("/upload")
	@ResponseBody
	public KindEditorUpLoadResult upload(MultipartFile uploadFile) {
		return itemService.upload(uploadFile);
	}*/
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("PicController.upload()");
		return "xx";
	}
}
