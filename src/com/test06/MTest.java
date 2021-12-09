package com.test06;

import com.test07.TV;

public class MTest { //spring이 내부적으로 이럼
	
	public static void main(String[] args) {
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean("lg");
		
		
		tv.powerOn();
		tv.powerOff();
		tv = (TV)factory.getBean("samsong");
		tv.volumeUp();
		tv.volumeDown();
		
		
		
	}

}
