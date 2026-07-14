package com.conditionalstatements;

public class Example3 {
	
	public boolean isEven(int num) {
		if(true) {
			return num%2==0;//true
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
       int a=4;
//      String result=(a%2==0)?"Even":"Odd";
//      System.out.println(result);
       
       
       
       
       
       
       Example3 obj=new Example3();
       
       boolean result=obj.isEven(a);
       if(result) {
    	   System.out.println("is Even..");
       }else {
    	   System.out.println("odd");
       }
       
	}

}
