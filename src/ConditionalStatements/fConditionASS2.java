package ConditionalStatements;

import java.util.Scanner;

public class fConditionASS2 {

	public static void main(String[] args) {

		//print the student reseult based on the grading system	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Exam Marks");
		int studentResult= scanner.nextInt();
		
		if(studentResult<35) {
			System.out.println("student is failed");
		}
		if(studentResult==35) {
			System.out.println("Student passed with cutoff marks");
		}
		if(studentResult>35 && studentResult<=70) {
			System.out.println("Student is passed in 3rd class");
		}
		if(studentResult>70 && studentResult<=85) {
			System.out.println("Student is passed in 2nd class");
		}
		if(studentResult>85) {
			System.out.println("Student is passed in 1st class");
		}
	}

}
