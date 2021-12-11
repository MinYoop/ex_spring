package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		//TODO : 004. "userService" 타입으로, 생성된 userServiceImpl 객체의 addUser() 메소드를 호출
		
		UserService userService = context.getBean("userServiceImpl",UserServiceImpl.class);
		
		userService.addUser();
	}
}
