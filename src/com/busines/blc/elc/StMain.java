package com.busines.blc.elc;

public class StMain {

	public static void main(String[] args) {
		Student st=new Student();
		st.setStName("devara");
		st.setStId(101);
		st.setStMarks(99);
		
		System.out.println(st.getStname());
		System.out.println(st.displayDetails());

	}

}
