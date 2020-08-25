package algorithm_pratice;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 5, 2, 7, 8,54,78,10,5,55,98,80,89 };
		bubbleSort(arr, arr.length);

	}

	public static void bubbleSort(int[] arr, int arrLenght) {
		int temp = 0;
		boolean flag = false;

		for (int i = 0; i < arrLenght - 1; i++) {
			for (int j = 0; j < arrLenght - i - 1; j++) {

				// swap if number is greater than next
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}

			}
			if (flag = false)
				break;
		}

		printArray(arr);

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
/*
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array
 * is reverse sorted.
 * 
 * Best Case Time Complexity: O(n). Best case occurs when array is already
 * sorted.
 * 
 * Auxiliary Space: O(1)
 * 
 * Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are
 * already sorted.
 * 
 */