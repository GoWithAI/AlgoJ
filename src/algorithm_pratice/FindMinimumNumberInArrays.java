package algorithm_pratice;

public class FindMinimumNumberInArrays {

	public static void main(String[] args) {
		// Find smallest element in both array return if both smallest element are equal
		// else return -1
		// Case : Array is of same Lenght

		int[] a = { 4, 1, 2, 9 };

		int[] b = { 4, 1, 2, 1 };

		System.out.println("Smallest element :" + findMinimumElement(a, b));

	}

	private static int findMinimumElement(int[] a, int[] b) {
		int aLenght = a.length;
		int bLenght = b.length;
		int maxLenght;

		if (aLenght < bLenght) {
			maxLenght = bLenght;
		} else {
			maxLenght = aLenght;
		}

		int i = 0;
		int minA = a[i];
		int minB = b[i];

		while (++i < maxLenght) {
			System.out.println(i);
			if (minA > a[i] && i < aLenght) {
				minA = a[i];
			}
			if (minB > b[i] && i < bLenght) {
				minB = b[i];
			}
		} // while
		if (minA == minB) {
			return minA;
		} else {
			return -1;
		}
	}

}
