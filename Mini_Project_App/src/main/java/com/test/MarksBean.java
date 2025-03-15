package com.test;

public class MarksBean 
{
	private int coreJava, advJava, ui, db, tools;
	private float total, per;
	private String grade=null;
	
	public MarksBean() {}

	public int getCoreJava() {
		return coreJava;
	}

	public void setCoreJava(int coreJava) {
		this.coreJava = coreJava;
	}

	public int getAdvJava() {
		return advJava;
	}

	public void setAdvJava(int advJava) {
		this.advJava = advJava;
	}

	public int getUi() {
		return ui;
	}

	public void setUi(int ui) {
		this.ui = ui;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getTools() {
		return tools;
	}

	public void setTools(int tools) {
		this.tools = tools;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
