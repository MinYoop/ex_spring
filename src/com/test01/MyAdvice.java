package com.test01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

public class MyAdvice {
	
	/*@Before("excution(public String com.test01.Person.sayName(..))")
	public void beforeSaying(JoinPoint join) {
		System.out.println("당신의 이름은 무엇입니까?");		
	}
	
	@After("excution(public String com.test01.Person.sayName(..))")
	public void afterSaing(JoinPoint join) {
		System.out.println("이름이 멋지시네요");		
		System.out.println("직업이 무엇입니까?");
		
	}
	
	public void afterReturnSaying(JoinPoint join) {
		
	}*/
	
	public void beforeSaying(JoinPoint join) {
		System.out.println("1.당신의 이름은 무엇입니까?");
	}
	
	public void afterSaying(JoinPoint join) {
		System.out.println("3.이름이 멋지시네요");
	}
	
	public void afterReturnSaying(JoinPoint join) {
		System.out.println("4.직업이 무엇입니까?");
	}
	
	
	

	
}

