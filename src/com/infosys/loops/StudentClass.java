package com.infosys.loops;

import java.util.Scanner;

public class StudentClass {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int Marks = sc.nextInt();
		
		if (Marks >=75) {
			System.out.println("Distinction");
		}else if (Marks >= 60  && Marks < 75) {
			System.out.println("First class");
		} else if (Marks >=55  && Marks < 60){
			System.out.println("Second class");
		}
		else {
			System.out.println("fail");
		}
			}}
