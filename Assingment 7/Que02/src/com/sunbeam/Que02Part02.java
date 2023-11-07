package com.sunbeam;

public class Que02Part02 {

	public static void main(String[] args) {
		
		String s1 = new String("this is string");
		String[] arr  = s1.split(" ");
		StringBuilder s2 = new StringBuilder();
		
		for (String s : arr) {
			
//			System.out.print(s);
			
			s2.append(Character.toUpperCase(s.charAt(0)));
			s2.append(s.substring(1));
			s2.append(" ");
		}
		System.out.println(s2);
	}

}
