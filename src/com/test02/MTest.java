package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test02/ApplicationContext.xml");
		
		System.out.println("-----------");
		
		System.out.println(((BirthDto)beans.getBean("kang")).getName()+"님의 생일은 "+((BirthDto)beans.getBean("kang")).getBirth()+"입니다");
		
		System.out.println(((BirthDto)beans.getBean("ho")).getName()+"님의 생일은 "+((BirthDto)beans.getBean("ho")).getBirth()+"입니다");
	}
}
