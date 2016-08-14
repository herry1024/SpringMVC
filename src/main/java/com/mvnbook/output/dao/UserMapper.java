package com.mvnbook.output.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mvnbook.output.model.User;

public interface UserMapper {
	
	User getUserById(@Param( "id" ) int id );
	List<User> getAllUser();
}
