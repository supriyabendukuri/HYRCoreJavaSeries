package ArraysConcepts;

public class ArrayASS1 {

	public static void main(String[] args) {
		
		int[] list = {2,5,1,9,6};
		System.out.println("array isze is  >>> " +list.length);
//		int sum=0;		
//		for(int i=0;i<list.length;i++) {
//			//System.out.println(list[i]);
//			
//				sum=	sum +list[i];
//		}
//		System.out.println(sum);
		
		int sum=0;
		for(int i=0;i<list.length;i++) {
			//System.out.println(list[i]);
			sum=sum+list[i];
		}
		System.out.println(sum/list.length);
		
	}

}
