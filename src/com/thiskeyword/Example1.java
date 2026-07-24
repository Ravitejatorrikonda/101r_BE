package com.thiskeyword;

public class Example1 {

	int a = 10;

	public void getData(int a) {
		System.out.println(a);//40
		System.out.println(this.a);//10
	}

	public static void main(String[] args) {

		Example1 obj1 = new Example1();
		Example1 obj2 = new Example1();
		
		
		
		obj1.a=20;
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//10
		obj2.getData(40);
		
		
		
		
		
		
//
		
		
		
//		System.out.println("======object 1==========");
//		System.out.println(obj1);
//		obj1.getData(40);
//
//		System.out.println("=====Object 2 ============");
//		System.out.println(obj2);
//		obj2.getData(50);

	}

}
