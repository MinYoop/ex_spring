package com.test03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
   
   @Before("execution(public void com.test03.*.*(..))")
   public void before(JoinPoint join) {
      System.out.println("출석카드 찍기");
   }
   
   @AfterThrowing(pointcut="execution(public void com.test03.*.*(..))",throwing="e"/*exception e 말하는거임 */)//에러 났을때 호출하자
   public void throwing(JoinPoint join) {
      System.out.println("쉬는 날이다.");
   }
   
   @After("execution(public void com.test03.*.*(..))")
   public void after(JoinPoint join) {
      System.out.println("강의장을 나간다.");
   }
   
}