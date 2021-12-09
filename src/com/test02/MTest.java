package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Address myAddr01 = (Address) app.getBean("myAddr01");
		System.out.println(myAddr01);
		
		Address myAddr02 =  app.getBean("myAddr02",Address.class);
		System.out.println(myAddr02);
		
		Address myAddr03 =  (Address) app.getBean("myAddr03");
		System.out.println(myAddr03);
		
		JobAddress lee = (JobAddress)app.getBean("lee");
		System.out.println(lee);
		
		JobAddress kim = app.getBean("kim",JobAddress.class);
		System.out.println(kim);
		
		
	}
}
