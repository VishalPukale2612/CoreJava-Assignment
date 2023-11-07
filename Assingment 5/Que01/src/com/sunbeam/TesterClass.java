package com.sunbeam;

public class TesterClass {

	public static void main(String[] args) {
		
		Circle c1=new Circle(10);
		System.out.println("Area is : "+ c1.calcArea());

		Triangle t1= new Triangle(10,10,10);
		System.out.println("Area is : "+ t1.calcArea());
		
		Rectangle r1= new Rectangle(12, 11);
		System.out.println("Area is : "+ r1.calcArea());
		
	}
}
