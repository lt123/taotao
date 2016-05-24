package com.taotao.manager.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taotao.manager.service.ItemService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-root.xml")
public class ItemServiceTest {
	@Autowired
	private ItemService ItemService;
	
	@Test
	public void testGetById() throws Exception {
		System.out.println(ItemService.getById(1l));
	}
	
	@Test
	public void testDeleteById() throws Exception {
		ItemService.deleteById(133l);
	}
	
	@Test
	public void testDeleteByIds() throws Exception {
		ItemService.deleteByIds("134,135");
	}
	
	
	@Test
	public void testGetCountByCondition() throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("Itemname", "admin");
		System.out.println(ItemService.getCountByCondition(map ));
	}
	
	@Test
	public void testGetByCondition() throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("Itemname", "admin");
		System.out.println(ItemService.getByCondition(map ));
	}
	
	@Test
	public void testGetPageResult() throws Exception {
		Map<String, Object> map = new HashMap<>();
//		map.put("Itemname", "admin");
		System.out.println(ItemService.getPageResult(map ));
	}
}
  