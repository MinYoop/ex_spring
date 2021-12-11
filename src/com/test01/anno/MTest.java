package com.test01.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/anno/beans.xml");
		
		System.out.println("----------");
		NicNamePrn my = factory.getBean("nicNamePrn",NicNamePrn.class);
		System.out.println(my);
	}
}
