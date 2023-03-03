package com.promptprogram;

public class StringExample {

	public static void main(String args[])
	{
		String str1 = " Fusion";  				//str is a variable we can use any variable expect str
		String str2 = "Fusion";  				// str and str1 is a string literal
		String str3 = new String ("Fusion"); 	// Using object
		
		
		System.out.println(str1.equals(str2)); 		//.equal is always check a case sensitive (compare two with case sensitive)
		System.out.println(str1.equalsIgnoreCase(str3));  //.equalsIgnoreCas it egnore case sensitive
		System.out.println(str1.compareTo(str3)); // always return interger value in output // S1 = = S2 : This method return 0
																							// S1>S2 : return positive value
																							// S1<S2 : return negative value
		System.out.println(str1 == str3);               // it check both variable are from same memory reference or not
		System.out.println(str1.concat (str2));    // it combine two i.e FusionFusion
		System.out.println(str1.replace ('F', 'S'));  // it can always replace with casesensitive
		System.out.println(str1.length ()); // alway calculate length with space
	
		
	}
	
}
