package com.codegnan.interfaces;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		FileLogger logger = new FileLogger();
		
		for(int i = 0; i<n; i++) {
			logger.log(sc.nextLine());
		}
		
		String flag = sc.nextLine();
		
		if(flag.equalsIgnoreCase("Yes")) {
			logger.clear();
			System.out.println("Cleared");
		} else {
			System.out.println("Logged: ["+ logger.getMessages()+"]");
		}
		sc.close();
	}

}
