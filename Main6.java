package com.codegnan.interfaces;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String message = sc.nextLine();
		String type = sc.nextLine().toLowerCase();
		
		Notifier notify;
		
		if(type.equals("email"))
			notify = new EmailNotifier();
		else
			notify = new SMSNotifier();
		
		System.out.println(notify.send(message));
		sc.close();
	}

}
