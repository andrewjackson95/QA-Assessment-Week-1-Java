package UniqueSum;

public class UniqueSum {

	public int valueCheck(int number1, int number2, int number3) {
		
		if (number1 == number2 && number2 == number3) {
			return 0;
		} else if (number1 != number2 && number2 == number3) {
			return number1;
		} else if (number1 == number2 && number2 != number3){
			return number3;
		} else if (number2 != number1 && number1 == number3){
			return number2;
		} else {
			int total = number1 + number2 + number3;
			return total;
		}
	}
}
