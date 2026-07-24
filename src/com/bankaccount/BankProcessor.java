package com.bankaccount;

public class BankProcessor {

	public static void main(String[] args) {

		
		BankAccount bank=new BankAccount(100, "Jayadeep", 10000.0);
		System.out.println("Current balance : "+ bank.getBalance());
		System.out.println("================");
		bank.deposit(1000);
		System.out.println("*****************");
		bank.withdraw(500);
		
	}

}
