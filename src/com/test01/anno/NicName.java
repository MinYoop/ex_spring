package com.test01.anno;

import org.springframework.stereotype.Component;

@Component
public class NicName {

	public NicName() {
		
		System.out.println("생성자");
		
		
	}
	
	public String toString() {
		return "nicname = 멍멍이";
	}
}
