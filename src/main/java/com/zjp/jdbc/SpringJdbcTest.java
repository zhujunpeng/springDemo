package com.zjp.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcTest {
	
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("bean.xml");
		UserService userService = (UserService) act.getBean("userService");
//		User user = new User();
//		user.setAge(33);
//		user.setName("发给我");
//		user.setSex("女");
//		userService.save(user);
		List<User> users = userService.getUsers();
		for (User user2 : users) {
			System.out.println(user2);
		}
		
	}

}
