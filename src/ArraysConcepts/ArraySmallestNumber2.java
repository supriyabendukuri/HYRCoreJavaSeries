package ArraysConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySmallestNumber2 {

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
		
		int smallestNumber= arrNumbers[0];
		int smallestNumberIndex = 0;
		for(int i=0; i<arrNumbers.length; i++) {
			if(smallestNumber>arrNumbers[i]) {
				smallestNumber = arrNumbers[i];
				smallestNumberIndex=i;
				
			}
			
		}
		System.out.println("smallest number is : " +smallestNumber);
		System.out.println("smallest number index is : " +smallestNumberIndex);

		s.close();
	}

}
