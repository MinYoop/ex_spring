package com.test05;

public class Engineer {
	
	private Emp emp;
	private String dept;
	
	public Engineer() {
		super();
	}

	public Engineer(Emp emp, String dept) {
		super();
		this.emp = emp;
		this.dept = dept;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() + " \t 부서 : " + dept +"(기술)";
	}
	
	

}
