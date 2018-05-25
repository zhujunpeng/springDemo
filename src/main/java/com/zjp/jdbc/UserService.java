package com.zjp.jdbc;

import java.util.List;

public interface UserService {
	
	void save(User user);
	
	List<User> getUsers();

}
