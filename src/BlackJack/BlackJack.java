package BlackJack;

public class BlackJack {
	
	int maxValue = 0;
	public int valueCheck(int number1, int number2){
		
		if (number1 < 21 && number2 > 21) {
			return number1;
		} else if (number1 > 21 && number2 < 21) {
			return number2;
		} else if (number1 > 21 && number2 > 21) {
			return 0;
		} else {
			maxValue = Math.max(number1, number2);
			return maxValue;
		}
	}
}
