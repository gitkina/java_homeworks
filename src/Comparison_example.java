//Fig2.7:Addition.java
//Addition program that displays the sum of two numbers input by user

import java.util.Scanner; //program uses class Scanner
	
	public class Comparison_example
	{
		//main method begins execution of Java application
		public static void main (String[]args)
		{
			//create a Scanner to obtain input from the command window
			Scanner input = new Scanner (System.in);
			
			int number1; //first number to add
			int number2; //second number to add
			int n3;// 3rd input
			int total;
			
			System.out.print("Enter first integer:"); //prompt
			number1=input.nextInt(); //read first number form user
			
			System.out.print("Enter second integer:"); //prompt
			number2=input.nextInt(); //read second number from user
			
			System.out.print("Enter third Integer:");//prompt
			n3=input.nextInt();//read third number from user
			
			total = number1 + number2;
			if(total == n3)
				System.out.printf("total of %d and %d is equal to %d\n", number1, number2, n3);
		if (total!=n3)
			if(total == n3)
				System.out.printf("total of %d and %d is not equal to %d\n", number1, number2, n3);
			
			
		}//end method main
	}//end class Addition
	
