package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		System.out.println(app.getBean("kang"));
		System.out.println(app.getBean("you"));
		
		((ClassPathXmlApplicationContext)app).close();
	}

}
