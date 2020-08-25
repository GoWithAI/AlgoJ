package algorithm_pratice;

public class FindMinimumNumberInArraysDiffLenght {

	public static void main(String[] args) {
		// Find smallest element in both array return if smallest element are equal
		// else return -1
		// Case : Array is of Not same Lenght
		// 
		int[] a = { 4, 9, 2, 7 };

		int[] b = { 4, 2, 2, 1, 4, 7 };

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
			if (i < aLenght) {
				if (minA > a[i]) {
					minA = a[i];
				}

			}
			if (i < bLenght) {
				if (minB > b[i]) {
					minB = b[i];
				}
			}

		} // while
		if (minA == minB) {
			return minA;
		} else {
			return -1;
		}
	}

}
