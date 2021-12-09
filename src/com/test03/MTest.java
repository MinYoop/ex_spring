package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		//기존 방식
		//1
		//Resource res = new FileSystemResource("src/com/test03/beans.xml");
		
		//2
		//Resource res = new ClassPathResource("com/test03/beans.xml");
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		
		MessageBean bean = (MessageBean)factory.getBean("bean01");
		bean.sayHello("Spring");
		
		bean = (MessageBean) factory.getBean("bean02");
		bean.sayHello("스프링");
		
	}
	
	/*I O C
	 * 
	 * Inversion of control 생성하는곳과 생성하는곳이 반대다. 제어 역전!;
	 * 
	 * 1.ApplicationContext와 ClassPathXmlApplicationContext
	 * BeanFactory <- ApplicationContext <- ClassPathXmlApplication
	 * 
	 * 스프링의 ApplicationContext 객체는 스프링 컨테이너의 인스턴스 이다.
	 * 스프링은 ApplicationContext 인터페이스의 몇가지 기본 구현을 제공한다.(ClassPathXmlApplicationContext : XML 형식의 독립형 어플리케이션에 적합.
	 * 지정된 classpath에서 applicationcontext.xml 파일을 읽어서 생성)
	 * 
	 * 2.contents, context, container
	 * 
	 * contents : 기능(내용)
	 * context : 기능을 구현하기 위한 정보(설정)
	 * container : 담아두는 곳
	 * 
	 */
	

}
