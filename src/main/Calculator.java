package main;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subract(int a, int b) {
		return a - b;
	}
	
	public double divide(double a, double b) {
		double answer = 0;
		if(a > b) {

			System.out.println("division cannot be performed");
		}
		else {
			answer = a / b;
		}
		return answer;
	}
}
