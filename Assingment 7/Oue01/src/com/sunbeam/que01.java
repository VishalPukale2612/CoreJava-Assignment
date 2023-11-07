package com.sunbeam;

public class que01 {

	public static void main(String[] args) {
  
		//String literalls
		
//		String s1 = "Ravindra";
//		String s2= "Ravindra";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
//		String s1 = new String ("Ravindra");
//		String s2 = new String ("Ravindra");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
//		String s1 = "Ravindra";
//		String s2 = new String ("Ravindra");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
//		String s1 = "Ravindra";
//		String s2 = "Ravi" + "ndra";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
//		String s1 = "Ravindra";
//		String s2 = "Ravi";
//		String s3 = s2 + "ndra";
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s3));
		
//		String s1 = new String ("Ravindra");
//		String s2 = new String ("Ravindra").intern();
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
//		String s1 = "Ravindra";
//		String s2 = "RaviNdra";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		//stringBuyffer 
		
//		StringBuffer s1 = new StringBuffer("Ravindra");
//		StringBuffer s2 = new StringBuffer("Ravindra");
//		System.out.println(s1==s2); // false
//		System.out.println(s1.equals(s2)); //false
		
		
//		StringBuffer s1 = new StringBuffer("Ravindra");
//		String s2 = new String("Ravindra");
////		System.out.println(s1 == s2);// Not ok, as objects of two diffrent classes are compaired
//		System.out.println(s1.toString()==s2); // false, as s1.toString will return string while s2 is reference type hence comparision is returning false 
//		System.out.println(s1.equals(s2)); // as StringBuffer class does not override equals method, 
		// this will invoke equals method of object class 
		//which only check the addresses of two objects and return true if same otherwise false
		
	
//		String s1= new String("Ravindra");
//		StringBuffer s2 = new StringBuffer("Ravindra");
//		System.out.println(s1.equals(s2)); //false
//		System.out.println(s1.equals(s2.toString())); //true
		
//		StringBuffer s1 = new StringBuffer("Ravindra");
//		StringBuffer s2 = s1.reverse();
//		System.out.println(s1 == s2); //true 
//		System.out.println(s1.equals(s2)); //true, compares adresses which are same
		
		//String Builder
		
//		StringBuilder s1 = new StringBuilder("Ravindra");
//		StringBuilder s2 = new StringBuilder("Ravindra");
//		System.out.println(s1 == s2);// false, compares adresses
//		System.out.println(s1.equals(s2));//false, compares adresses
		
		
//		StringBuffer s1 = new StringBuffer("Ravindra");
//		StringBuffer s2 = new StringBuffer("Ravindra");
//		System.out.println(s1 == s2);// false
//		System.out.println(s1.equals(s2));//false
		
		StringBuffer s = new StringBuffer();
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 0
		s.append("1234567890");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 10
		s.append("ABCDEFGHIJKLMNOPQRSTUV");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 34, 32
		
		
	}

}
