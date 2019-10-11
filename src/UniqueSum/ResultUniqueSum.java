package UniqueSum;

import java.util.Scanner;

public class ResultUniqueSum {
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter first integer: ");
	    int number1 = input.nextInt();
	    System.out.print("Enter second integer: ");
	    int number2 = input.nextInt();
	    System.out.print("Enter third integer: ");
	    int number3 = input.nextInt();
	    	
	    input.close();
			
		UniqueSum task1 = new UniqueSum();
		System.out.println("Input(" + number1 + "," + number2 + "," + number3 + ")-> " + task1.valueCheck(number1, number2, number3));
	}
}
