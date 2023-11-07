package com.sunbeam;

public class Que02Part04 {

	public static void main(String[] args) {
		
		String s1 = new String("www.sunbeaminfo.com.myName.ravi.com");
		String s2 = new String();
		System.out.print("Before replace : ");
		System.out.println(s1);
		
		s2 = s1.replaceAll("com","in"); //ok, it does not modify the original string s1 but returns a new string with the replacements
		s2 = s1.replace("com", "in"); //ok, it does not modify the original string s1 but returns a new string with the replacements
//		s2 = s1.replaceFirst(".","DOT"); //o/p

		
		System.out.print("After replace : ");
		System.out.println(s2);
		
	}

}
