package com.thiskeyword;

public class Employee {
	
	//BLC
	private String empName;
	private String empDesg;
	
	
	//getters
	
	public String getEmpName() {
		return empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	
	//setters
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	
	
	public void showData() {
		System.out.println("Employee Name  : "+ empName);
		System.out.println("EMployee desg :"+ empDesg);
	}
	
	
	
	
	
	
	

}
