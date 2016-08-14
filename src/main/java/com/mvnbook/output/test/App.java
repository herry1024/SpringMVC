package com.mvnbook.output.test;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.Test;


public class App {
	private static Logger logger = Logger.getLogger(App.class);
	private  ApplicationContext context;
//	@Test
//	public  void testspring()
//    {
//		context = new ClassPathXmlApplicationContext("classpath*:config/applicationContext.xml");
//    	OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
//    	output.generateOutput();
//////    	//获取classpath
//    	System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
////    	//获取当前文件执行的绝对路径
////    	System.out.println(App.class.getResource(""));
//    	logger.warn("真的乱码么？");
//    }
	
	@Test
	public  void testspringmybatis()
    {
		context = new ClassPathXmlApplicationContext("classpath*:config/applicationContext.xml");
    	OutputHelper output = (OutputHelper)context.getBean("UserDao");
    	output.generateOutput();
////    	//获取classpath
    	System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
//    	//获取当前文件执行的绝对路径
//    	System.out.println(App.class.getResource(""));
    	logger.warn("真的乱码么？");
    }
}
