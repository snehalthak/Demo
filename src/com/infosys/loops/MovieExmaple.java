package com.infosys.loops;

import java.util.Scanner;

public class MovieExmaple {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Movie");
		int ratings = sc.nextInt(); 
		
		if (ratings > 5) {
			System.out.println("Blockbaster");
		}
		else {
			System.out.println("Fail");
		}
		
		
		
		
		
	}
	

}
