package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/Beans.xml");
		
		MessageBean strawberry = (MessageBean) factory.getBean("strawberry");
		strawberry.sayHello();
		
		MessageBean grape = (MessageBean) factory.getBean("grape");
		grape.sayHello();
		
		MessageBean banana = (MessageBean) factory.getBean("banana");
		banana.sayHello();
		
	}
	

}
