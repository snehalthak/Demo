package abc;
//program to take input ( numbers 1 to 10 ) from user and write switch case to print animal name

import java.util.Scanner;
public class Switch
{
	public static void main(String[] args) {
			int number;
			System.out.println("Enter Number:");
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();

			switch (number) {
			case 1:
				System.out.println("Tiger");
				break;
			case 2:
				System.out.println("Lion");
				break;
			case 3:
				System.out.println("Fox");
				break;
			case 4:
				System.out.println("Dog");
				break;
			case 5:
				System.out.println("Pig");
				break;
			case 6:
				System.out.println("Elephant");
				break;
			case 7:
				System.out.println("Zebra");
				break;
			case 8:
				System.out.println("Horse");
				break;
			case 9:
				System.out.println("Cat");
				break;
			case 10:
				System.out.println("Cow");
				break;
			default:
				System.out.println("Animal Not in the list");

			}

		}
}
