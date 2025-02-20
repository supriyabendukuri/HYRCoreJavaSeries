package ConditionalStatements;

import java.util.Scanner;

public class SwitchASS3 {

	public static void main(String[] args) {


		Scanner s= new Scanner(System.in);
		System.out.println("Enter the day name");
		String day = s.nextLine();

		switch(day){
		case "Monday":
			System.out.println("Uff, weekday");
			break;
		case "Tuesday":
			System.out.println("Uff, weekday");
			break;
		case "wednesday":
			System.out.println("Uff, weekday");
			break;
		case "thursday":
			System.out.println("Uff, weekday");
			break;
		case "friday":
			System.out.println("Uff, weekday");
			break;
		case "saturday":
			System.out.println("Yayy, weekend....");
			break;
		case "sunday":
			System.out.println("Yayy, weekend....");
			break;
		default:
			System.out.println("pass correct day");
			break;
		}

	}

}
