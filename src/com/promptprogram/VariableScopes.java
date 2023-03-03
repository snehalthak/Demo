package com.promptprogram;

public class VariableScopes {   		//the space which is under in class called as global space eg our house
	
	
	int a = 10; 		// global and non static variable
	static int b = 30;  // global and static variable

	public static void main(String args[]) {		//the space which is under in method called as global space eg bedroom
		
		
		int a = 15;										// local variable
		
		System.out.println(a);
		System.out.println(b);	// we can print the global variable into local space but make sure our global variable is static becz static method is only call the static									
		
												// if we used same variable in local and global space then it is acceptable
												//	if we used same variable in local space then it is not acceptable // same for global
		
		
		
		
		
		
		
	}
	

}
