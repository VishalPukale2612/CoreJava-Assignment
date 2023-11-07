package com.sunbeam;

public class que03 {

	public static void main(String[] args) {
		String[] arrStr = {"Ravindra","Pritam","Vishal","Pratik",
							"Shubham","Astha","Neha","Aarti"} ;
		for(int i=0;i<arrStr.length;i++) {
			if(arrStr[i].charAt(arrStr[i].length()) == "a"||"e"||"i"||"o"||"u") {
				System.out.println(arrStr[i]);
			}
		}


	}

}
