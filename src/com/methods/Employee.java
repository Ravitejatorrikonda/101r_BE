package com.methods;

public class Employee {
	
	String empName;
	String empDesg;
	static double empSalary;
	
	public void displayDetails() {
		System.out.println("Employee Name  : "+ empName);
		System.out.println("Employee Desg  : "+ empDesg);
		System.out.println("Employee Salary  : "+ empSalary);
	}

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.empName="Vinay";
		emp1.empDesg="SE";
		emp1.empSalary=100000.0;
		
		emp1.displayDetails();
		
		emp1.empName="Nehmiya";
		emp1.empDesg="SD";
//		emp1.empSalary=200000.0;
		emp1.displayDetails();

	}

}
