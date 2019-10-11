package conditionals;

public class conditionalTask1 {

	int answer;

	public int intsAndABool(int a, int b, boolean c) {

		if (a % 2 == 0 && b % 2 == 0) {

			return 0;
		}
		if (c == true) {
			answer = a + b;
			return answer;
		}
		
		else {
			answer = a * b;
			return answer;
		}
	}
}
