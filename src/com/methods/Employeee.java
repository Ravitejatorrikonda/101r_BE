package com.methods;

public class Employeee {
	
	String empName;
	String empDesg;
	int empId;
	double empSalary;
	
	public void setEmpname(String name) {
		empName=name;
	}
	public void setEmpDesg(String desg) {
		empDesg=desg;
	}
	public void setEmpId(int id) {
		empId=id;
	}
	public void setEmpSalary(double salary) {
		empSalary=salary;
	}
	//Getters
	
	public String getEmpName() {
		return empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}
	
	public String displayDetails() {
		return "Employee Name : "+ getEmpName()+ "\n Employee Desg : "+ getEmpDesg()+"\nEmployee Id : "+
	    getEmpId()+ "\nEmployee Salary : "+ getEmpSalary();
	}
	
	

	public static void main(String[] args) {
		
		Employeee emp=new Employeee();
		
		emp.setEmpname("sandesh");
		emp.setEmpDesg("SD");
		emp.setEmpId(100);
		emp.setEmpSalary(70000.0);
		
		
		System.out.println(emp.getEmpName());
		
//		System.out.println(emp.displayDetails());
		
		/**
		 * 
		 * 
		 * Write a java program to find the student details
		 * 
		 *       stname;
		 *       stIid
		 *       st marks;
		 *      setters and getters
		 */

	}

}
