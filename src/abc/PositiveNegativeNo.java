
//Java program to check weater number is possitive or negative
package abc;

import java.util.Scanner;

public class PositiveNegativeNo 
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number to check:");
			int a=sc.nextInt();
					
			//int a=5;
			if(a>0)
			{
				System.out.println("The no is positive");
			}
			else if(a<0)
			{
				System.out.println("The no is negative");
			}
			else
			{
				System.out.println("no is zero");
			}
		}

	}
		