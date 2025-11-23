package com.codegnan.interfaces;

public class Rectangle implements Shapes{

	private double length;
	private double width;
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length + width);
	}

}
