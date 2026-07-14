package com.methods;

public class Example5 {
	
	int num;
	public void getdata() {
		System.out.println(hashCode());
	}

	public static void main(String[] args) {
          Example5 obj=new Example5();
          System.out.println(obj.hashCode());
          obj.getdata();
          
          Example5 obj2=new Example5();
          System.out.println(obj2.hashCode());
          obj2.getdata();
	}

}
