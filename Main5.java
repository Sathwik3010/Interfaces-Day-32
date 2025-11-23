package com.codegnan.interfaces;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length");
		double length = sc.nextDouble();
		System.out.println("Enter width");
		double width = sc.nextDouble();
		
		Shapes rect = new Rectangle(length, width);
		
		System.out.printf("Area: %.2f\n",rect.area());
		System.out.printf("Perimeter: %.2f",rect.perimeter());

		sc.close();
	}

}
