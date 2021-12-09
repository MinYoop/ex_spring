package com.test08;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String grade;
	
	public Score() {
		super();
	}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getGrade(double avg) {
		switch((int)(avg/10)) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	}
	
	public String toString() {
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		String grade = getGrade(avg);
		
		
		String res = name + "님의 성적의 합은 " + sum + ",  평균은 " + avg + ", 등급은 " + grade +"입니다.";
				
		return res;
	}
	
	public void setScore() {
		
		System.out.println();
	}
	
}
