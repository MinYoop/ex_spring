package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/beans.xml");
		
		Engineer kang = factory.getBean("kang",Engineer.class);
		System.out.println(kang);
		
	}

}
