package com.codegnan.interfaces;

public class EmailNotifier implements Notifier{

	@Override
	public String send(String message) {
		// TODO Auto-generated method stub
		return "Email: "+message;
	}

}
