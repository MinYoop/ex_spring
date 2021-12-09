package com.test08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test08/applicationContext.xml");
		
		System.out.println("-------------");
		
		Bar b = factory.getBean("bar",Bar.class);
		b.prn();
		
		Foo f = factory.getBean("foo",Foo.class);
		// 실행하고 출력 순서 잘보깅
		
		
		
		
	}
	

}
