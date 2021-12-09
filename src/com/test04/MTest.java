package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("com/test04/ApplicationContext.xml");
		System.out.println(app.getBean("kangho"));
		System.out.println(app.getBean("youjae"));
		
		((ClassPathXmlApplicationContext)app).close();
	}

}
