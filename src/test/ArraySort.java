package test;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 3, 7, 2, 11, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[i] > arr[j + 1]) {
					int temp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}

}
