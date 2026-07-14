package com.methods;

public class Example6 {
	String name,city,street,roadNo;
	
	public String getname() {
		return name;
	}
	public void setName(String nme) {
		name=nme;
	}
	
	public void setCity(String cit) {
		city=cit;
	}
	public String getCity() {
		return city;
	}
	
	public void setStreet(String stre) {
		street=stre;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setRoadNo(String no) {
		roadNo=no;
	}
	
	public String getRoadNo() {
		return roadNo;
	}
	
	

	public static void main(String[] args) {
		Example6 obj=new Example6();
		  obj.setName("Vinay");
		  obj.setCity("HYD");
		  obj.setStreet("KPHB");
		  obj.setRoadNo("01");
		System.out.println(obj.getname());
		System.out.println(obj.getCity());
		System.out.println(obj.getStreet());
		System.out.println(obj.getRoadNo());
	

	}
	
	/**
	 * 
	 * Write a java program to find the Emloyee Details
	 *      String empname, empDesg,
	 *      int empId;
	 *      double empSalary;
	 *    
	 *    with the help of getters and setters
	 * 
	 */

}
