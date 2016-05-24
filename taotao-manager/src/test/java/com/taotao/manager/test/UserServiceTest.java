package com.taotao.manager.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taotao.manager.model.User;
import com.taotao.manager.service.IUserService;

/**
 * ClassName:UserServiceTest
 * Function: TODO
 * Reason:   TODO
 * Date:     2016-5-23 上午11:41:02
 * @author   litao
 * @version  V1.0  
 * @see       
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-root.xml")
public class UserServiceTest {
	@Autowired
	private IUserService userService;
	
	@Test
	public void testGetById() throws Exception {
		System.out.println(userService.getById(1l));
	}
	
	@Test
	public void testDeleteById() throws Exception {
		userService.deleteById(133l);
	}
	
	@Test
	public void testDeleteByIds() throws Exception {
		userService.deleteByIds("134,135");
	}
	
	@Test
	public void testUpdate() throws Exception {
		User user = userService.getById(1l);
		user.setSalt("xxx");
		user.setEmail("xx@qq.com");
		userService.update(user);
	}
	
	@Test
	public void testSave() throws Exception {
		for (int i = 0; i < 100; i++) {
			User user = new User();
			user.setCreateDate(new Date());
			user.setEmail("xeqwex" + i + "@qq.com");
			user.setPassword("pwd" + i + "@qq.com");
			user.setPhone("1333333332" + i);
			user.setSalt("xxxx" + i);
			user.setUpdateDate(new Date());
			user.setUsername("usernaamee" + i);
			userService.save(user);
		}
	}
	
	@Test
	public void testGetCountByCondition() throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("username", "admin");
		System.out.println(userService.getCountByCondition(map ));
	}
	
	@Test
	public void testGetByCondition() throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("username", "admin");
		System.out.println(userService.getByCondition(map ));
	}
	
	@Test
	public void testGetPageResult() throws Exception {
		Map<String, Object> map = new HashMap<>();
//		map.put("username", "admin");
		System.out.println(userService.getPageResult(map ));
	}
}
  