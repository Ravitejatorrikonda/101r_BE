package com.library.staff;

public class Librarian {
  private String  librarianName;
  private int yearsofExp;
  //getters
  
  public String getLibrarianName() {
	return librarianName;
  }
  public int getYearsofExp() {
	return yearsofExp;
  }
  
  //setters
  public void setLibrarianName(String librarianName) {
	this.librarianName = librarianName;
  }
  public void setYearsofExp(int yearsofExp) {
	this.yearsofExp = yearsofExp;
  }
  
  public void showLibrarianInfo() {
	  System.out.println("librariyan Name : "+ librarianName);
	  System.out.println("Years of Exp : "+ yearsofExp);
  }
  
  
  
  
  
	
	
}
