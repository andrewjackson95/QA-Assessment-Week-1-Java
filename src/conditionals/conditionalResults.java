package conditionals;

public class conditionalResults {

	public static void main(String[] args) {

		conditionalTask1 task1 = new conditionalTask1();
		System.out.println("Input(" + 2 + "," + 2 + "," + true + ")-> " + task1.intsAndABool(2, 2, true));
		System.out.println("Input(" + 3 + "," + 3 + "," + false + ")-> " + task1.intsAndABool(3, 3, false));
		System.out.println("Input(" + 1 + "," + 1 + "," + true + ")-> " + task1.intsAndABool(1, 1, true));
	}
}
