package com.sunbeam;

public class Square extends Polygon{
	double side;
	
	//Constructor
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calcArea() {
		
		double Area=Math.pow(side,2);
		return Area;
	}

}
