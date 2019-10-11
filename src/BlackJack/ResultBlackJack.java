package BlackJack;

import java.util.Scanner;

public class ResultBlackJack {
	public static void main(String[] args) {
		
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter first integer: ");
    	int number1 = input.nextInt();
    	System.out.print("Enter second integer: ");
    	int number2 = input.nextInt();
    	
    	input.close();
		
		BlackJack task1 = new BlackJack();
		System.out.println("Play(" + number1 + "," + number2 + ")-> " + task1.valueCheck(number1, number2));
	}
}
