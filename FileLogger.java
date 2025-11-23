package com.codegnan.interfaces;

public class FileLogger implements Logger{

	private String messages = " ";
	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		if(messages.isEmpty()) {
			messages = message;
		} else {
			messages += message+", ";
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		messages = "";
	}

	public String getMessages() {
		return messages;
	}
}
