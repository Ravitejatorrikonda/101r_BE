package com.loops;

public class Example5 {
	// power
	public int getPower(int base, int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power =power*base;
		}
		return power;//27
	}
	
	//Count
	//                       153
	public int getCount(int num) {
		int count=0;
		while (num !=0) {
			count++;
			num /=10;
		}
		return count;//3
	}
	
	
	//Amstrong
	//                             153
	public boolean isAmstrong(int num) {
		
		//    3
		int count=getCount(num);//3
		int temp=num;
		int sum=0;//153
		
		while (num !=0) {
			 //  1
			int base=num%10; 
			   //152+   1       1    3
			sum=sum+getPower(base, count);
			num /=10;
			
		}
		return temp==sum;
		
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
                    Example5 obj=new Example5();
                    
//                    System.out.println(obj.isAmstrong(12)?"Amstrong":"! amstrong ");
                    
                    for (int i = 100; i <200; i++) {
						if(obj.isAmstrong(i)) {
							System.out.println(i);
						}
					}
	}

}
