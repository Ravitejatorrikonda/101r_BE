package com.employe;

public class Employee {
	int empId;
	String empname;
	String empDesg;
	double empsalary;
	int rating;
	
	public Employee(int empId, String empname, String empDesg, double empSalary, int rating) {
		this.empId=empId;
		this.empname=empname;
		this.empDesg=empDesg;
		this.empsalary=empSalary;
		this.rating=rating;
		System.out.println("Employee details addedd successfully");
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpname() {
		return empname;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public int getRating() {
		return rating;
	}
	
	//setters

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void promoteEmployee(String desg) {
		if(rating >= 4) {
			empsalary += (empsalary * 0.20);
			System.out.println("Updated Salary : "+ empsalary);
			this.empDesg=desg;
		}else {
			System.out.println("no pramotion");
		}
	}
	
	
	
	
	

}
