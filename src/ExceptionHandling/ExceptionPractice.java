package ExceptionHandling;

public class ExceptionPractice {

	public static void main(String[] args) {
		
			int a=10;
			int b= 0;
			int c;
			try {
				System.out.println(c=a/b);

			}
			catch(ArithmeticException ae) {
				//System.out.println(ae.toString());
				ae.printStackTrace();
				//System.out.println(ae.getMessage());
				//System.out.println(ae.getStackTrace());
				
			}
			finally {
				System.out.println("finally executed by supriya");
			}
			
			
	}

}
