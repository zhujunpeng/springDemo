package com.zjp.mybaties;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.zjp.mybaties.bean.User;
import com.zjp.mybaties.dao.UserMapper;

public class MapperTest {
	
	static SqlSessionFactory sqlSessionFactory;
	static {
		sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
	}

	@Test
	public void testAdd(){
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = new User("wfg", 7);
			userMapper.insertUser(user);
			// 这里一定要提交不然数据无法写入
			session.commit();
		} finally{
			session.close();
		}
	}
	
	@Test
	public void getUser(){
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = userMapper.getUser(1);
		System.out.println(user);
	}
}
