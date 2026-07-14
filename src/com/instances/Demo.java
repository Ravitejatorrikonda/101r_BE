package com.instances;

public class Demo {
	public int a = 34; // ->non-staticinstance variable

//	public void getData() {// non-static or instance method
//		System.out.println(a);
//	}

	public static void main(String[] args) {
//                 ClassName refVar = new ClassName();
		
		              Demo obj=new Demo();//100x
		              
		              System.out.println(obj.a);
		              
	}

}
