package com.busines.blc.elc;

public class Student {

	String stName;
	int stId;
	int stMarks;
	
	public void setStName(String name) {
		stName=name;
	}
	public void setStId(int id) {
		stId=id;
	}
	public void setStMarks(int marks) {
		stMarks=marks;
	}
	
	public String getStname() {
		return stName;
	}
	public int getStId() {
		return stId;
		
	}
	public int getStMarks() {
		return stMarks;
	}
	
	public String displayDetails() {
		return "Student name : "+ getStname()+"\nSt Id : "+getStId()+"\nSt Marks : "+ getStMarks();
	}
	
	

}
