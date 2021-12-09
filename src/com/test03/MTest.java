package com.test03;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		//오늘 날짜 출력
		
		System.out.println(beans.getBean("mydate"));
		
		UserDto user = (UserDto)beans.getBean("mydto");		
		System.out.println(user.getMyDate());
		
		//userDto 객체에서 getPer(), getUserName()
		
		System.out.println(user.getPer());
		System.out.println(user.getUserName());
				
		//userService 객체 만들고 위에서 가져온 userDto객체를 addUser()에 아규먼트로 넣기
		
		UserService userservice = (UserServiceImpl) beans.getBean("myService");
		
		userservice.addUser(user);
		
		
	}
}
