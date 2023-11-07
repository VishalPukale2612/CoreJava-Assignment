package com.sunbeam;

public class Triangle extends Polygon{
	double side1;
	double side2;
	double side3;
	
	//constructor
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public double calcArea() {
		
		//sp = Semiperimetere
		double sp;
		
		sp = (side1+side2+side3)/2;
		
		// √s(s - a)(s - b)(s - c) 
		
		double Area= Math.sqrt(sp*(sp-side1)*(sp-side2)*(sp-side3));
		return Area;
	}
	
}
