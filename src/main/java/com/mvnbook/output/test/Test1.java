package com.mvnbook.output.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import com.mvnbook.output.dao.Impl.UserDao;
import com.mvnbook.output.model.User;

public class Test1 {
	private static Logger logger = Logger.getLogger(App.class);
	private  ApplicationContext context;
	
	@Test
	public  void testspringmybatis()
    {
		context = new ClassPathXmlApplicationContext("classpath*:config/applicationContext.xml");
		UserDao userDao = (UserDao)context.getBean("UserDao");
		logger.info(userDao.getUserById(1).getName());
		
		List<User> userlist= new ArrayList<User>();
		userlist=userDao.getAllUser();
		for( User user:userlist){
			logger.info(user.getId());
			logger.info(user.getName());
			logger.info(user.getAge());
		}
    }
}
