package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		//application context 에서 lazy-init 해놔서 엘지만 생김
		
		TV tv = (TV)factory.getBean("samsong");
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		tv = factory.getBean("lj",TV.class);
		
	}

}
