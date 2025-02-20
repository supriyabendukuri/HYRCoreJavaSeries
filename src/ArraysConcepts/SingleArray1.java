package ArraysConcepts;

import java.util.Arrays;

public class SingleArray1 {

	public static void main(String[] args) {

		int[] arr= {2,45,67,8,9}; 
		
		//int sum=0;
		int laregestNumebr=arr[0];
		for(int values:arr) {
			System.out.println(values);
			//sum+=values;
			if(laregestNumebr<arr[values]) {
				laregestNumebr=arr[values];
				
			}

		}
		System.out.println(laregestNumebr);

		//System.out.println(sum);
		//	System.out.println(sum/arr.length);	
		//System.out.println(Arrays.toString(arr));		
				
				
	}

}
