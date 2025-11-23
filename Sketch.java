package com.codegnan.interfaces;

public class Sketch implements Drawable{

	@Override
	public void draw(String shape) {
		// TODO Auto-generated method stub
		System.out.println("Drawing "+shape);
	}

	@Override
	public void erase(String shape) {
		// TODO Auto-generated method stub
		System.out.println("Erasing "+shape);

	}

}
