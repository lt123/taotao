package com.taotao.manager.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
}
  