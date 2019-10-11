package Taxes;

public class Taxes {

	public double salaryPercent(double salary) {
		double total = 0;
		
		if (salary >= 0 && salary <= 14999) {
			return salary;
		} else if(salary >= 15000 && salary <= 19999) {
			total = salary * 0.9;
			return total;
		} else if(salary >= 20000 && salary <= 29999) {
			total = salary * 0.85;
			return total;
		} else if(salary >= 30000 && salary <= 44999) {
			total = salary * 0.80;
			return total;
		} else {
			total = salary * 0.75;
			return total;
		}
	}
}
