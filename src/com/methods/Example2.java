package com.methods;

public class Example2 {
	public static void getData(int a,int b) {
		System.out.println(a+b);
	}
	public static String printData(String a,String b) {
		System.out.println("hello");
		return a+b;
	}

	public static void main(String[] args) {
		String result=printData("hello", "there");
		System.out.println(result);
		
//		    getData(10,20);
//		   
//		    int result=printData(40,50);
//		    System.out.println(result);


	}

}
