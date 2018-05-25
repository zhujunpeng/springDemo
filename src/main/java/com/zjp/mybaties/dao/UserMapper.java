package com.zjp.mybaties.dao;

import org.springframework.stereotype.Repository;

import com.zjp.mybaties.bean.User;

@Repository
public interface UserMapper {
	
	void insertUser(User user);
	
	User getUser(Integer id);

}
