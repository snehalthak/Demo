package com.infosys.loops;

import java.util.Scanner;

public class SwitchStatementExample2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr your role: 1. Admin 2.Maker 3.Checker");
		String Bankrole = sc.nextLine(); 
		
		switch(Bankrole)   {
			
		case "Admin" : System.out.println("Having all rights"); break;
		case "Maker" : System.out.println("Create account rights"); break;
		case "Checker" : System.out.println("Approve rights"); break;
		default : System.out.println("No rights");		
		
		
		}
		
	}
	
	
	

}
