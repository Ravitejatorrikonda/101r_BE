package com.variabless;

public class Example2 {
	
//	public static void printData() {
//		System.out.println("this is static method");
//		getData();
//	}
//	public static void getData() {
//		System.out.println("this is also a static method 2....");
//	}
	
	
	public static int a=10;
	public static int b=20;
	
	public static void Demo(String a, String b) {
		System.out.println(a==b);
	}
	
	
	
	
	

	public static void main(String[] args) {
               Demo("java","java");
	}

}
