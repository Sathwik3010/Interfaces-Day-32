package com.codegnan.interfaces;

public class PositiveNumberValidator implements Validator{

	@Override
	public boolean isValid(int n) {
		// TODO Auto-generated method stub
		return n > 0;
	}

}
