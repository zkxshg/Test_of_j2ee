package cn.itcast.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.itcast.service.AccountService;

public class Test {
	public static void main(String[] args) {
//		// 获得容器，并操作
//		String xmlPath = "applicationContext.xml";
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
//				xmlPath);
//		AccountService accountService = (AccountService) applicationContext
//				.getBean("accountServiceProxy");
//		accountService.transfer("jack", "rose", 100);
//		System.out.println("ok");
//********************************基于xml方式********************************************************
//		// 获得spring容器，并操作
//		String xmlPath = "applicationContext_xml.xml";
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
//				xmlPath);
//		AccountService accountService = (AccountService) applicationContext
//				.getBean("accountService");
//		accountService.transfer("jack", "rose", 100);
//		System.out.println("ok");
//*********************************基于注解的方式******************************************************	
		// 获得spring容器，并操作
		String xmlPath = "applicationContext_annotation.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				xmlPath);
		AccountService accountService = (AccountService) applicationContext
				.getBean("accountService");
		accountService.transfer("jack", "rose", 100);
		System.out.println("ok");	

	}
	
}
