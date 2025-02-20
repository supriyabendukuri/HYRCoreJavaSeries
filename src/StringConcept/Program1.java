package StringConcept;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string value   :");
		String value= s.nextLine();
		//System.out.println(value);
		//System.out.println(value.length());
		//System.out.println(Arrays.toString(value.toCharArray()));
		//System.out.println(value.split(" ").length);
		
//		System.out.println("Please enter the target character : ");
//		char targetCharacter = s.next().charAt(0);
//		int count=0;
//		for(int i=0;i<value.length();i++) {
//			if(value.charAt(i)==targetCharacter) {
//				count++;
//				
//			}
//			
//		}
//		System.out.println(count);
		
//		String input= "Supriya";
//		
//		String reverse = "";
//		for(int i=input.length()-1; i>=0; i--) {
//			reverse = reverse + input.charAt(i);
//			
//		}
//		System.out.println(reverse);
		
		//System.out.println(value.trim());
		
		String reverse ="";
		for(int i=value.length()-1; i>=0;i--) {
			reverse += value.charAt(i);
			
		}
		s.close();
		System.out.println(reverse);
		System.out.println(value.split(" "));
	}


}
