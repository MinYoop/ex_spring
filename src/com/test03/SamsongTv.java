package com.test03;

import org.springframework.stereotype.Component;

@Component
public class SamsongTv implements TV {

	
	
	public SamsongTv() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("samsong tv 생성자");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("samsong tv power up");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("samsong tv power off");

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("samsong tv volume up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("samsong tv volume off");
	}

}
