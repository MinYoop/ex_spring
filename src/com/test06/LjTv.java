package com.test06;

public class LjTv implements TV {
	
	public LjTv() {
		System.out.println("Lj tv 생성");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("lg tv power up");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("lg tv power off");

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("lg tv volume up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("lg tv volume off");
	}

}
