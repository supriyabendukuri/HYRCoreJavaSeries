package ArraysConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySmallestNumber4 {

	public static void main(String[] args) {

		int[] arrNumbers = new int[5];
		arrNumbers[0] =5;
		arrNumbers[1] =7;
		arrNumbers[2] =33;
		arrNumbers[3] =4;
		arrNumbers[4] =8;
		//arrNumbers[5] =5;
		
		
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

		
	}

}
