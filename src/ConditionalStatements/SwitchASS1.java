package ConditionalStatements;

import java.util.Scanner;

public class SwitchASS1 {

	public static void main(String[] args) {

		//given number is even or odd
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number");
		int number=	 scanner.nextInt();

		switch(number%2) {
		case 0:
			System.out.println("given number is even number");
			break;
		case 1:
			System.out.println("given number is odd number");
			break;

		default:
			System.out.println("its default case");

		}

	}

}
