package recursion;

/**
 * Multiply two integers without using multiplication, division and bitwise
 * operators, and no loops
 */
public class MultiplicationWithoutStar {

	public static void main(String[] args) {

		withoutStar();

		int smallerValue = -5;
		int greaterValue = -8;
		System.out.println(withRecursion(greaterValue, smallerValue));
	}

	private static int withRecursion(int i, int j) {

		if (j == 0)
			return 0;

		if (j > 0) { // In case of j is +ve
			return i + withRecursion(i, j - 1);
		}

		if (j < 0) // In case of j is -ve
			return i + withRecursion(i, j + 1);

		return 0;

	}

	private static void withoutStar() {
		int i = 6;
		int j = 7;

		int value = 0;
		int count = 0;

		while (count < i) {
			value = j + value;
			count++;
		}

		System.out.println(value);

	}

}
