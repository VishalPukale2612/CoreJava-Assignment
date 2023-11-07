package com.sunbeam;

public class Que02Part03 {

	public static void main(String[] args) {

		String s1 = new String("Example");
		
		StringBuilder s2 = new StringBuilder();
		
		for(int i=0;i<s1.length();i++) {
			 if(i%2==0) {
				 s2.append(Character.toLowerCase(s1.charAt(i)));
			 }
			 else {
				 s2.append(Character.toUpperCase(s1.charAt(i)));
			 }
		}
		System.out.println(s2);
	}

}
