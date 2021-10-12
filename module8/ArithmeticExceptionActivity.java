public class ArithmeticExceptionActivity {
	//1 - Type main method and call catchMe with 10 and 0
	public static void main(String[] args) {		
		ArithmeticExceptionActivity obj=new ArithmeticExceptionActivity();
		obj.catchMe(10,0);
		System.out.println("==================================");
		obj.catchMe(10, 2);
	}

	static void catchMe(int num1, int num2)
	{
		//The following code results in an Exception.
		//2 - Identify the exception and write code to handle this exception.
		try {
			int result=num1/num2;
			System.out.println("The result is : " + result);
		} catch(ArithmeticException ex) {
			System.out.println("It is not possible to divide by 0");
		} finally {
			System.out.println("Thank you for using this program.");
		}
		 
		//3 - After handling the exception, write a finally block which
		//prints a message "Thank you for using this program."
		
		//4- try to call catchMe with 10 and 2 now and see which messages get printed.
	}

}
