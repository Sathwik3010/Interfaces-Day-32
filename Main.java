package com.codegnan.interfaces;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Write an input");
		sc.nextLine();
		
		Vehicle v = new Cars();
		System.out.println(v.move());
		sc.close();
	}

}
