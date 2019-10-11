package main;

public class App {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(1,4));
		System.out.println(calc.subract(4, 1));
		System.out.println(calc.divide(1, 3));
		
		results result = new results();
		System.out.println(result.examResults(50,100,100));
		System.out.println(result.examPercentage());
	}
}
