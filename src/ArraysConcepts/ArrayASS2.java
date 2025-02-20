package ArraysConcepts;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayASS2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the array size");
		int array	= scanner.nextInt();
		
		int[] arrValues = new int[array];
		System.err.println(Arrays.toString(arrValues));
		
		System.out.println("enter the values");
		for(int i=0; i<arrValues.length; i++) {
			arrValues[i] =scanner.nextInt();
			
		}
		System.err.println(Arrays.toString(arrValues));

	  	
		int sum = 0;
		for(int j=0; j<arrValues.length; j++) {
			sum = sum+arrValues[j];
			
		}
		
		System.out.println("output : " +sum);
		scanner.close();

		
	}

}
