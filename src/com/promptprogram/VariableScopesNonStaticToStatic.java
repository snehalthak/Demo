package com.promptprogram;

public class VariableScopesNonStaticToStatic {

	int a = 15;
	
	public static void main(String[] args) {
		
		
		VariableScopesNonStaticToStatic vv = new VariableScopesNonStaticToStatic();
		System.out.println(vv.a);
		
	}

}
