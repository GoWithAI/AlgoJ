package array.problems1;

public class ArrayPermutation {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 2, 1, 5, 3, 4 };
		buildArray(nums);

	}

	// time O(n)
	// space O(n)
	public static int[] buildArray(int[] nums) {

		int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}

	// time O(n)
	// space O(1)
	// Need to understand ?
	public static int[] buildArray2(int[] nums) {
		int mask = 1023; // Decimal value of the binary number '1111111111'
		for (int i = 0; i < nums.length; i++)
			nums[i] |= (nums[nums[i]] & mask) << 10;
		for (int i = 0; i < nums.length; i++)
			nums[i] = nums[i] >> 10;
		return nums;
	}

}
