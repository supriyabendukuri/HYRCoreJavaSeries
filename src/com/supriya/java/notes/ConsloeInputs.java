package com.supriya.java.notes;

import java.util.Scanner;

public class ConsloeInputs {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("what is your name?");
		String message1=scanner.nextLine();
		System.out.printf("Hey %s, How r u? \n", message1);
		scanner.nextLine();
		System.out.println("What is your age?");
		scanner.nextInt();
		System.out.println("Are u married ?");
		scanner.nextBoolean();
		
	}

}
