package com.codegnan.interfaces;

public class CreditCard implements Payment{

	@Override
	public boolean pay(double amount, double balance) {
		// TODO Auto-generated method stub
		return amount<=balance;
	}

}
