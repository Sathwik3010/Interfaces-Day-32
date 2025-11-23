package com.codegnan.interfaces;

public class SMSNotifier implements Notifier{

	@Override
	public String send(String message) {
		// TODO Auto-generated method stub
		return "SMS: "+message;
	}

}
