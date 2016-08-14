package com.mvnbook.output.service.Impl;

import java.util.List;

import com.mvnbook.output.dao.UserMapper;
import com.mvnbook.output.dao.Impl.UserDao;
import com.mvnbook.output.model.User;
import com.mvnbook.output.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Override
	public User getUserById(int id) {

		return userDao.getUserById(id);
	}

	@Override
	public List<User> getAllUserList() {
		
		return userDao.getAllUser();
	}

}
