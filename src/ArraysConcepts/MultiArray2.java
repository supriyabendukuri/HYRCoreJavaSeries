package ArraysConcepts;

public class MultiArray2 {

	public static void main(String[] args) {

//		int[][] arr= new int[3][2];
//		arr[0][0]=1;
//		arr[0][1]=2;
//		arr[1][0]=3;
//		arr[1][1]=4;
//		arr[2][0]=5;
//		arr[2][1]=6;
		
		int[][] arr= {
				{2,3},
				{5,6, 5},
				{7,8},
				
		};
//		for(int[] singleArray:arr) {
//			for(int values: singleArray) {
//				System.out.print("  "+values);
//				
//			}
//			System.out.println();
//
//		}
		int sum=0;
		int average =0;
		for(int[] singleArray:arr) {
			for(int values: singleArray) {

				sum+=values;
				average++;
			}

		}
		System.out.println(sum);
		System.out.println(sum/average);

	}

}
