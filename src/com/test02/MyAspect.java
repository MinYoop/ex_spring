package com.test02;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {//메소드를 호출 했을 때 Proxy라는 애가 woman 인척 man 인척 하고 cc의 내용 호출 앞뒤에 공통요소 cc에 붙여준다. 

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object returnVal = null;
		
		System.out.println("출석카드 찍는다. ");
		
		try {
			returnVal = invocation.proceed();			
		}catch(Exception e) {
			System.out.println("쉬는 날이다.");
		}finally {
			System.out.println("강의장을 나간다.");
		}		
		return returnVal;
	}

}
