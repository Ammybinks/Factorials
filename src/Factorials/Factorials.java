package Factorials;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int integer;
		int factorial = 1;
		int it = 1;
		
		System.out.println("Please enter a number:");
		
		while(scanner.hasNextInt() == false)
		{
			System.out.println("Please try again:");
		}
		
		integer = scanner.nextInt();
		factorial = integer;
		
		for(int i = 1; i < integer; i++)
		{
			factorial = factorial * i;
		}
		System.out.println("Your number is... *dundundundundudnudnudndundundudndundudndundudndududn*");
		System.out.println(factorial + "!");
		factorial = integer;
		
		while(it < integer)
		{
			factorial = factorial * it;
			
			it++;
		}
		System.out.println("\nAnd again...");
		System.out.println(factorial);
	}

}
