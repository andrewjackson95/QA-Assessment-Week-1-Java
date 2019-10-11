package Taxes;

import java.util.Scanner;

public class ResultTaxes {
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter salary: ");
	    double salary = input.nextInt();
	    
	    input.close();
	    
	    Taxes task1 = new Taxes();
	    System.out.println("Input(£" + salary + ")-> £" + task1.salaryPercent(salary));
	}
}
