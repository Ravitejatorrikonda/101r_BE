package com.methods;

public class Example3 {
	int num;
	static String name;
                   
	public static void main(String[] args) {
		Example3 obj1=new Example3();
		Example3 obj2=new Example3();
		System.out.println(obj1.num);
		System.out.println(obj1.name);
		System.out.println(obj2.num);
		System.out.println(obj2.name);
		System.out.println("---after modifying ......");
		
		obj1.num=10;
		obj1.name="tejaswini";
		System.out.println(obj1.num);//10
		System.out.println(obj1.name);//tejaswini
		System.out.println(obj2.num);//0
		System.out.println(obj2.name);//tejaswini
		
		
                       
	}

}
