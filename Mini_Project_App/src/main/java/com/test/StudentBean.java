package com.test;

public class StudentBean 
{
	private int rollNo;
	private String name, course;
	private MarksBean mk = new MarksBean();
	public StudentBean() {}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public MarksBean getMk() {
		return mk;
	}

	public void setMk(MarksBean mk) {
		this.mk = mk;
	}
	
	
	
}
