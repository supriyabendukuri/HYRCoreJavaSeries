package ConditionalStatements;

import java.util.Scanner;

public class SwitchASS2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		double firstNumber =scanner.nextDouble();
		System.out.println("enter second number");
		double secondNumber =scanner.nextDouble();
		System.out.println("pass operator");
		char operator = scanner.next().charAt(0);
		switch(operator) {
		case '+':
			System.out.println( firstNumber+secondNumber);
			break;
		case '-':
			System.out.println( firstNumber-secondNumber);
			break;
		case '/':
			System.out.println(firstNumber/secondNumber);
			break;
		case '%':
			System.out.println(firstNumber%secondNumber);
			break;
		default:
			System.out.println("pass correct operator");

		}

	}

}
