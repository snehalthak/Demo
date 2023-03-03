package com.infosys.loops;

import java.util.Scanner;

public class SwitchStatementExample {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = sc.next();
		switch(name)   {
		
		case "Switi" : System.out.println("Monday"); break;
		case "sumit" : System.out.println("Tuesday"); break;
		case "somesh" : System.out.println("Wensday"); break;
		case "snehal" : System.out.println("Thusday"); break;
		default : System.out.println("None of these");
		}

	}
	
	
	
	}
