package ConditionalStatements;

import java.util.Scanner;

public class IfConditionASS3 {

	public static void main(String[] args) {
		//print the statements based on day name
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day name");
		String dayName = scanner.nextLine();
		
		if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||dayName.equalsIgnoreCase("Wednesday")
				|| dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")|| dayName.equalsIgnoreCase("Friday")) {
			System.out.println("Uff's, its a weekday");
		}
		
		
		else if(dayName.equalsIgnoreCase("Sunday") || dayName.equalsIgnoreCase("saturday")){
			System.out.println("Yayy, its a weekend");
		}
		
		else
		{
			System.err.println("enter correct day name");
		}
	}

}
