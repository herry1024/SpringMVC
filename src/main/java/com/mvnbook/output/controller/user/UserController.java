package com.mvnbook.output.controller.user;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mvnbook.output.model.User;
import com.mvnbook.output.service.UserService;

@Controller
@RequestMapping("/open/user")
public class UserController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping("/getAllUsers")
	public List<User> getUserList() {
		return userService.getAllUserList();
	}

}
