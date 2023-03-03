package com.promptprogram;

public class DataTypeExample {
	
	public static void main(String args[]) {
		DataTypeExample exp = new DataTypeExample();
		exp.addNumber();
		TestExample sub = new TestExample();
		sub.substraction();
		DataTypeExample.addNumber1();
		
	}
    public void addNumber()  // Non static method
    {
    	int a = 20;
    	int b = 30;
    	int c = a + b;
    	
    	System.out.println("Addition of two number:" +c);   //System.out.println(c);
    }
	public static void addNumber1()   // Static Method
	{
		int d = 30;
		int e = 50;
		int f = d + e;
		System.out.println("Addition of two number:" +f);   // System.out.println(f);
		
	}
	

	
}
