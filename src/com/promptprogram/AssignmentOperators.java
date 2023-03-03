package com.promptprogram;

public class AssignmentOperators {

	public static void main(String[] args) {
		int a = 10;
		a = a + 30;		// output is 50....if we dont have to use a again & again then we have below method
		 a+= 30;
		System.out.println(a); // Same eg for -=, /=,%=, *=
		
		System.out.println(a << 3); 	// 10*2^3 
		System.out.println(a >> 3); 	// 10/2^3

	}

}
