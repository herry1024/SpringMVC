package com.mvnbook.output.service;

import java.util.List;

import com.mvnbook.output.model.User;

public interface UserService {

	User getUserById(int id);
	
	List<User> getAllUserList();
}
