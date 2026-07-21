package com.loops;

public class Example6 {

	// Basic approach

//	public boolean isPrime(int num) {
//		int count=0;//2
//		for(int i=1;i<=num;i++) {
//			//0==0
//			if(num%i==0) {
//				count++;
//			}
//		}
//		return count==2;
//		
//	}

	// Second Approach

//	public boolean isPrime(int num) {
//		
//		for(int i=2;i<num;i++) {
//			if(num%i==0) {
//				return false;
//			}
//			
//		}
//		return true;
//	}

	// 3rd approach;

	public boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		
		for(int i=2; i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;

	}
	
	
	
//	Write a java program to find the ugly number and harshad number

	public static void main(String[] args) {
		Example6 obj = new Example6();
//		System.out.println(obj.isPrime(10) ? "prime" : "! Prime");
		for(int i=1;i<=200;i++) {
			if(obj.isPrime(i)) {
				System.out.println(i);
			}
		}

	}

}
