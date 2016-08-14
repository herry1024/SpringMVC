package com.mvnbook.output.dao.Impl;

import java.util.List;

import com.mvnbook.output.dao.UserMapper;
import com.mvnbook.output.model.User;

public class UserDao implements UserMapper {

	private UserMapper usermapper;

	public UserMapper getUsermapper() {
		return usermapper;
	}

	public void setUsermapper(UserMapper usermapper) {
		this.usermapper = usermapper;
	}

	@Override
	public User getUserById(int id) {
		return usermapper.getUserById(id);
	}

	@Override
	public List<User> getAllUser() {
		
		return usermapper.getAllUser();
	}

}
