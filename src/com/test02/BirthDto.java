package com.test02;

public class BirthDto {

	private String name;
	private String birth;
	
	
	public BirthDto() {
		super();
		System.out.println("기본생성자");
	}


	public BirthDto(String name, String birth) {
		super();
		System.out.println("생성자");
		this.name = name;
		this.birth = birth;
		System.out.println(name + birth);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		System.out.println("this.name" + this.name);
		this.name = name;
		System.out.println("변경 뒤 this.name" + this.name);
		
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;

	}
	
	
	
}
