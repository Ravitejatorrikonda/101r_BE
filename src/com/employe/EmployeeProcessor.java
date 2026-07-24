package com.employe;

public class EmployeeProcessor {

	public static void main(String[] args) {

		Employee emp=new Employee(34, "teja", "Trainer", 10000.0, 3);
		System.out.println("EMployee Id : "+emp.getEmpId());
		System.out.println("EMployee Name : "+emp.getEmpname());
		System.out.println("EMployee Desg : "+emp.getEmpDesg());
		System.out.println("EMployee Salary : "+emp.getEmpsalary());
		System.out.println("EMployee 5 : "+emp.getRating());
		
		System.out.println("============================");
		emp.promoteEmployee("S Trainer");
		System.out.println("updated Desg : "+ emp.getEmpDesg());
		
	}

}
