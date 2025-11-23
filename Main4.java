package com.codegnan.interfaces;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		Validator validator = new PositiveNumberValidator();
		
		if(validator.isValid(number))
			System.out.println("Valid");
		else
			System.out.println("Valid");
		
		sc.close();
	}

}
