package ArraysConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargestNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("enter array size : ");
		int arrSize = s.nextInt();
		
		System.out.println("enter the array values: ");
		int[] arrNumbers = new int[arrSize];
		for(int i=0; i<arrNumbers.length; i++) {
			arrNumbers[i] = s.nextInt();
		}
		
		System.out.println(Arrays.toString(arrNumbers));
		
		int largestNumber= arrNumbers[0];
		int largestNumberIndex = 0;
		for(int i=0; i<arrNumbers.length; i++) {
			if(largestNumber<arrNumbers[i]) {
				largestNumber = arrNumbers[i];
				largestNumberIndex=i;
				
			}
			
		}
		System.out.println("largest number is : " +largestNumber);
		System.out.println("largest number index is : " +largestNumberIndex);

		s.close();
	}

}
