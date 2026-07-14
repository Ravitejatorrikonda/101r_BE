package com.conditionalstatements;

public class Example2 {

	public static void main(String[] args) {

		int marks=120;
		
		if((marks<= 100) && ( marks >= 90)) {
			System.out.println("Grade A");
		}else if((marks >=80) && (marks < 90))  {
			System.out.println("Grade B");
		}else if((marks >= 70 )&& (marks < 80)) {
			System.out.println("Grade C");
		}else if((marks >= 60)&&(marks < 70)) {
			System.out.println("grade D");
		}else if((marks >= 0) && (marks < 60)) {
			System.out.println("fail");
		}else {
			System.out.println("Invalid");
		}
		
		
		
	}

}
