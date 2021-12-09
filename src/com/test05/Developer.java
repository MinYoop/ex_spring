package com.test05;

public class Developer {
	
	private String dept;
	private Emp emp;
	
	
	
	public Developer() {
		super();
	}
	public Developer(String dept, Emp emp) {
		super();
		this.dept = dept;
		this.emp = emp;
	}
	
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	public String toString() {
		return super.toString() + " \t 부서 : " + dept +"(개발)";
	}

	

}
