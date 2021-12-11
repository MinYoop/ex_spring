package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		//aop 공통적인 것과 공통적이지 않은 것을 나누겠다!!
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/beans.xml");
		NicNamePrn my = factory.getBean("nicNamePrn",NicNamePrn.class);
		System.out.println(my);
	}
}
