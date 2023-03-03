package com.promptprogram;

import java.util.Scanner;

public class ScannerProgramPercentage {
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your math marks");
	int math = sc.nextInt();
	
	System.out.println("Enter your English marks");
	int English = sc.nextInt();
	System.out.println("Enter your Hindi marks");
	int Hindi = sc.nextInt();
	System.out.println("Enter your marathi marks ");
	int marathi = sc.nextInt();
	System.out.println("Enter your History marks");
	int History = sc.nextInt();

	TestExample1 test = new TestExample1();
	double aa = test.calculatepercentage (math,English,Hindi,marathi,History);
	System.out.println(aa+"%");
	
	
	
	
	}

}
