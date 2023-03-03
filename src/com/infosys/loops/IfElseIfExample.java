package com.infosys.loops;

import java.util.Scanner;

public class IfElseIfExample {
	
	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		
		int marks = sc.nextInt();
		
		if(marks > 50) {
			
			System.out.println("pass");
		} 
		else {
			System.out.println("Fail");
		}
		
		
		
	}

}
