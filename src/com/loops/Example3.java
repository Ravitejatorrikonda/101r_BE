package com.loops;

public class Example3 {
	
	public boolean reverseNumber(int num) {
		int temp=num;
		int rev=0;
		while(num !=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num /=10;
			
		}
		return temp==rev;
	}

	public static void main(String[] args) {
		Example3 obj=new Example3();
		
		
		for (int i = 1; i <=10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
		
		
//		boolean result=obj.reverseNumber(121);
//		System.out.println(result?"Palindrome":"! Palindrome");
		
		
		/**
		 * 1234->4321->
		 * 
		 * 121->121->
		 * 
		 * \
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        /**
         * 
         *             
         *             Write a java program to find the reverse a number
         *           i/p:-  int a=1234;
         *           o/p:-   4321;
         */
		
		
		
//		int i=101;
//		int rev=0;//1
//		while(i!=0) {
//			int rem=i%10;
//			rev=rev*10+rem;
//			i /=10;
//		}
//		System.out.println(rev);
		
		
	}

}
