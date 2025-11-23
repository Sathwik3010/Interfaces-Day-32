package com.codegnan.interfaces;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
		
		Shape shape = new Circle();
		System.out.println(shape.getName());
		sc.close();
	}

}
