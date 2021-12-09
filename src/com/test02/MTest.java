package com.test02;

public class MTest {
	
	public static void main(String[] args) {
		MessageBean bean = new MessageBeanEn();
		bean.sayHello("Spring");
		MessageBean bean01 = new MessageBeanKo();
		bean01.sayHello("스프링");
		
	}
}
