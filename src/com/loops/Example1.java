package com.loops;

public class Example1 {
	
	public void printTabel(int num, int val) {
		System.out.println(num+"X"+val+"="+num*val);
	}
	
	
	//amstrong
	
	public int getPower(int base, int exp) {
		int power=1;
		for (int i = 1; i <= exp; i++) {
			power=power*base;
			
		}
		return power;
		
	}
	
	
	public int getCount(int num) {
		int count=0;
		while (num !=0) {
			count++;
			num /=10;
		}
		return count;
	}
	
	public boolean isamstrong(int num) {
		int count=getCount(num);
		System.out.println(count);
		 int temp=num;
		 int sum=0;
		 while (num !=0) {
			int base=num %10;
			sum=sum+getPower(base, count);
			num/=10;
		}
		 return temp==sum;
	}
	
	

	public static void main(String[] args) {
		Example1 obj=new Example1();
		System.out.println(obj.isamstrong(153));
		
		
		
//		for(int i=0;i<=10;i=i+2) {
//			System.out.println(i);
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		
		
//		for(int i=1;i!=11;i++) {
//			System.out.println(i);//1
//		}
		
		
		
		
//		for(int i=10;i>=1;i--) {
//			System.out.println(i);//10 9
//		}
//		
		
		
		
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//		}
		
		
		
		
		
		
//		Example1 obj=new Example1();
//		int i=1;
//		for(;i<=10;i++) {
//			obj.printTabel(7, i);
//		}
//		System.out.println(i);
		

		
	}

}
