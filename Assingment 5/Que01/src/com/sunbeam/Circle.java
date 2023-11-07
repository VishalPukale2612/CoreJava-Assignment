package com.sunbeam;

public class Circle extends BoundedShape{
	double radius;
	static final double PI=3.14;
	
	
	//Constructor parameterized
	public Circle(double radius) {
		this.radius = radius;
	}



	@Override
	public double calcArea() {
		
		return PI* Math.pow(radius, 2);
	}
	
	
	
}
