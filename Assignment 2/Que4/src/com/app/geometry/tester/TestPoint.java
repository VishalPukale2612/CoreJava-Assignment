package com.app.geometry.tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
// Point2D p1 = new Point2D(10,33);
// Point2D p2 = new Point2D(5,6);	
		Point2D p1 = new Point2D();
		p1.acceptData();
		Point2D p2 = new Point2D();	
		p2.acceptData();
		
 System.out.println("Distance : "+ p1.calculateDistance(p2));

 if(p1.isEqual(p2)) {
	 System.out.println("Both points are same");
 	}
 else {
	 System.out.println("Both points are different");
 	}
}

}
