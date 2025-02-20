package ArraysConcepts;

import java.util.Iterator;

public class ArrayPractice1 {

	public static void main(String[] args) {

		int[] i= new int[6];
		i[0] = 10;
		i[1] = 20;
		i[5] = 50;
//		System.out.println(i[0]);
//		System.out.println(i[1]);
//		System.out.println(i[2]);
//		System.out.println(i[3]);
//		System.out.println(i[4]);
//		System.out.println(i[5]);
	//	System.out.println(i[6]); // it will give ArrayIndexOutOfBoundsException because array size is crossed
		
		int sum = i[0] + i[1] + i[2] + i[3]+i[4] + i[5];
		System.out.println(sum);
		
		System.out.println(i.length);
		
		for(int j=0; j<i.length;j++ ) {
			System.out.println(i[j]);
			
		}
		
	}

}
