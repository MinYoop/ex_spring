package com.test04;

public class Emp { //getter setter 안하고 상속 안받음
	
	private String name;
	private String salary;
	
	public Emp() {
		
	}
	
	public Emp(String name, String salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "이름 : " + name + "\t 급여 : " + salary;
	}

}
