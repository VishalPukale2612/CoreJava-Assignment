package com.sunbeam;

public class Rectangle extends Polygon {
 double length;
 double breadth;
 
 
 public Rectangle(double length, double breadth) {
	this.length = length;
	this.breadth = breadth;
}


@Override
	public double calcArea() {
	 double Area = length* breadth;
		return Area;
	}
}
