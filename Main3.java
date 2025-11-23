package com.codegnan.interfaces;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		MathOperation operation = new Square();
		int result = operation.operate(number);
		System.out.println(result);
		sc.close();
	}

}
