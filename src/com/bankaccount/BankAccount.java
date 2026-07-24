package com.bankaccount;

public class BankAccount {
    int accNum;
    String accHolderName;
    double balance;
	public BankAccount(int accNum, String accHolderName, double balance) {
		
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.balance = balance;
		System.out.println("Acc details updated successfully");
	}
	//getters
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	
	//setters
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Businness logic
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance = balance+amount;
			System.out.println("updated Balanace : "+ balance);
			System.out.println("Deposit Successfully");
		}else {
			System.out.println("Inavalid ammount");
		}
	}
	
	public void withdraw(double amount) {
		if((balance >= amount) && (amount > 0)) {
			this.balance=balance-amount;
			System.out.println("Updated Balance after withdraw : "+ balance);
			System.out.println("Withdraw Success");
		}else {
			System.out.println("Insufficient balance");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
	
}
