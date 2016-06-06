package com.taotao.manager.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.taotao.common.model.KindEditorUpLoadResult;
import com.taotao.common.service.impl.BaseServiceImpl;
import com.taotao.common.util.StringUtil;
import com.taotao.common.util.fastdfs.FastDFSUtil;
import com.taotao.manager.model.Item;
import com.taotao.manager.service.ItemService;

@Service
public class ItemServiceImpl extends BaseServiceImpl<Item,Long> implements ItemService {

	@Value("${2001}")
	private String IMAGE_SERVER_BASE_URL;
	
	@Override
	public String upload(MultipartFile uploadFile) {
		String url = FastDFSUtil.upload(uploadFile, null);
		if(StringUtil.isNotBlank(url)) {
			url = IMAGE_SERVER_BASE_URL + url;
			return JSON.toJSONString(new KindEditorUpLoadResult(0, url, null));
		}
		return JSON.toJSONString(new KindEditorUpLoadResult(1, null, "图片上传失败"));
	}

}
