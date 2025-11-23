package com.codegnan.interfaces;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Calculator calc = new BasicCalculator();
		int result = calc.add(a, b);
		System.out.println(result);
		sc.close();
	}

}
