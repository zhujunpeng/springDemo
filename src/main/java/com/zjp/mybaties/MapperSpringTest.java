package com.zjp.mybaties;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zjp.mybaties.bean.User;
import com.zjp.mybaties.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-mybatis.xml")
public class MapperSpringTest {
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void getUser(){
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = userMapper.getUser(1);
		System.out.println(user);
	}
	
	@Test
	public void insertTest(){
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = new User("zzz追", 30);
		userMapper.insertUser(user );
	}
}
