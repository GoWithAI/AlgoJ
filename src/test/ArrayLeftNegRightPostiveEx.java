package test;

public class ArrayLeftNegRightPostiveEx {

	public static void main(String[] args) {

		int[] arr = { 4, -3, 8, 9, -1, 5, 2, -10, -11, 45 };
		// {-3,-1,-10,-11,4,8,9,5,2,45}

		// O(n)
		int left = 0;
		int right = arr.length - 1 ;

		while(right != left){

			if (arr[left] <= 0) {
				left++;
			}
			if (arr[right] >= 0) {
				right--;
			}

			// 1. Swap
			if (arr[left] > 0 && arr[right] < 0) {
				int temp;
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		for(int i : arr) {
			System.out.print(i +"  ");
		}
		
	}

}
