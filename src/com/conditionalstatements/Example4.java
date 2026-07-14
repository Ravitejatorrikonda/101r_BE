package com.conditionalstatements;

public class Example4 {

	public static void main(String[] args) {
		int num = 108;
		switch (num) {
		case 100: {
			System.out.println("call police");
			break;
		}
		case 108:
			System.out.println("call ambulance...");
			break;
		case 112:
			System.out.println("call firestation..");
			break;

		default:
			System.out.println("invalid number");
			break;

		}
	}

}
