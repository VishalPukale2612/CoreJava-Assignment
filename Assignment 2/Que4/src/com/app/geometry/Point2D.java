package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	double x_axis;
	double y_axis;
	
	
	public Point2D() {
		x_axis=0;
		y_axis=0;
	}

	public Point2D(int x_axis, int y_axis) {
		super();
		this.x_axis = x_axis;
		this.y_axis = y_axis;
	}

	public String getDetails(Point2D obj) {
		
		String x = String.valueOf(obj.x_axis);
		String y = String.valueOf(obj.y_axis);
		return "("+x+","+y+")";
	}
		
	public boolean isEqual(Point2D obj) {
		if (this.x_axis == obj.x_axis && this.y_axis == obj.y_axis) {
			return true;
			}
		else
		return false;
	}
	
	public double calculateDistance(Point2D obj2) {
		
		// Formula d=√((x2 – x1)² + (y2 – y1)²).
		
		double x=	this.x_axis - obj2.x_axis;
		double y=	this.y_axis	- obj2.y_axis;
		
		return Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
	}
	
	public void acceptData() {
		System.out.println("Enter co-ordinates of point");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter value of x :");
			this.x_axis=sc.nextDouble();
			
			System.out.println("Enter value of y :");
			this.y_axis=sc.nextDouble();
	}
}

	


