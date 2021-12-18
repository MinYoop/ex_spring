package com.test06;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
   
   //pointcut으로 사용할 empty class <-test03과의 차이점 
   @Pointcut("execution(public * *(..))") // pointCut이 지금 여기서는 classWork 만 대응되지만 다른 메소드를 만들어도 이 형식에맞으면 프록시가 생성되어 실행됨
   public void myClass() {
      
   }
   @Before("myClass()")
   public void before(JoinPoint join) {
      System.out.println("출석카드 찍는다.");
      
   }
   
   @After("myClass()")
   public void after(JoinPoint join) {
      System.out.println("강의장을 나간다.");
   }
}