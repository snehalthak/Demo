package com.infosys.loops;

import java.util.Scanner;

public class UsingStirngMethod {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Eneter operation to be performed");
		System.out.println("Multi, Add, Sub, Div");
		
		Scanner sc2 = new Scanner (System.in);
		String oper = sc2.next();
		
		if(oper.equalsIgnoreCase("Add"))
		{
			System.out.println(a+b);
		}else if (oper.equalsIgnoreCase("sub")) {
			System.out.println(a-b);
		}else if (oper.equalsIgnoreCase("multi")) {
			System.out.println(a*b);
		}else {
			System.out.println("Invalid choice");
		}}}
