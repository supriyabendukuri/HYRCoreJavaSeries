package ArraysConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class AverageValuesArray {

	public static void main(String[] args) {

			Scanner scanner= new Scanner(System.in);
			System.out.println("size of array");

			int arr = scanner.nextInt();
			int[] arrValues = new int[arr];
			System.err.println(Arrays.toString(arrValues));

			System.out.println("enter values");
			for(int i=0; i<arrValues.length; i++) {
				arrValues[i] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arrValues));
			
			int sum=0;
			for(int j=0; j<arrValues.length; j++) {
				sum = sum+arrValues[j];
			}
			System.out.println("Average of integer array  "+sum/arrValues.length);
			
			scanner.close();
	}

}
