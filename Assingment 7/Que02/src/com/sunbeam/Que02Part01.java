package com.sunbeam;

public class Que02Part01 {

	public static void main(String[] args) {
		
		String s1 = new String("Bank Of Maharashtra");
		String[] arr = s1.split(" ");
		StringBuilder s3 = new StringBuilder();
		
		for(int s2=0 ; s2<arr.length;s2++) {
//			System.out.println(arr[s2]);
//			System.out.print(arr[s2].charAt(0));
			s3.append(arr[s2].charAt(0));
		}
		System.out.println(s3);
	}
}