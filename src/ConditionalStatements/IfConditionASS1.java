package ConditionalStatements;

import java.util.Scanner;

public class IfConditionASS1 {

	public static void main(String[] args) {


		//Verify any given number is even or odd

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number= scanner.nextInt();
		if(number%2==0) {
			System.out.println("Entered number is even number");
		}
		else
		{
			System.out.println("Given number is odd number");
		}
	}

}
