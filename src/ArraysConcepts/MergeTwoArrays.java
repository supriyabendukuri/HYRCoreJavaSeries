package ArraysConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.err.println("enter the size of fist array");
		int arr1 = s.nextInt();
		
		String[] values = new String[arr1];
		
		System.out.println("enter values  ");
		for(int j =0; j<arr1; j++) {
			values[j]=s.next();
		}
		
		System.out.println(Arrays.toString(values));
		
		System.err.println("enter the size of 2nd array");
		int arr2 = s.nextInt();
		String[] values2=new String[arr2];
		
		for(int j=0; j<arr2;j++) {
			values2[j]=s.next();
		}
		System.out.println(Arrays.toString(values2));

		String[] arr3=new String[values.length+values2.length];
		
		for(int i=0; i<values.length;i++) {
			arr3[i] = values[i];
		}
		for(int i=0; i<values2.length;i++) {
			arr3[i+values.length] = values2[i];
		}
		System.out.println(Arrays.toString(arr3));

	}

}
