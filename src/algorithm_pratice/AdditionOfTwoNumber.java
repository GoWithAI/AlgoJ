package algorithm_pratice;

public class AdditionOfTwoNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 6, 2 }; // space taken here is n
		// Time is 1 unit
		int sum = 0; // space is 1 unit
		// Time is 1 unit
		for (int i = 0; i < arr.length; i++) {
			// 1 , n+1 , n Time Complexity = 2n+2 , let consider n+1 highest
			sum += arr[i];
			// Time complexity unit n
		}
		// return s; //Time complexity unit 1

		// Time complexity 1+1+(n+1)+n
		// f(n)= 2n+1
		// Time complexity O(n)

		// Space Complexity
		// arr[] is n
		// sum is 1 unit
		// int is 1 unit
		// arr.length is 1 unit
		// s(n)= n+3
		// Space Complexity O(n)
	}

}
