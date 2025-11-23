package com.codegnan.interfaces;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double amount = sc.nextDouble();
		double balance = sc.nextDouble();
		
		Payment payment = new CreditCard();
		
		if(payment.pay(amount, balance))
			System.out.println("Payment Successful");
		else
			System.out.println("Insufficient Balance");
		sc.close();
	}

}
