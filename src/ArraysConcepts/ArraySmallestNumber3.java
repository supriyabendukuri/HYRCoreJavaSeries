package ArraysConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySmallestNumber3 {

	public static void main(String[] args) {

		int[] arrNumbers = new int[]{2,3,5,7,1};
		
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
