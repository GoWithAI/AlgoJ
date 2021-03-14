package problems.string;

/**
 * Reverse String 1. Approach 1: Recursion, In-Place, O(N)\mathcal{O}(N)O(N)
 * Space 2. Approach 2: Two Pointers, Iteration, O(1)\mathcal{O}(1)O(1) Space
 **/
public class ReverseString {

	public static void main(String[] args) {

		String str = "hello";

		approch1(str);
		approch2(str);
		approch2b(str);
		approch3(str);

	}

	/**
	 * Time Complexity : O(n) Space Complexity : Not Sure ??
	 * 
	 * 
	 **/
	private static void approch3(String str) {
		int length = str.length();

		StringBuffer revsersString = new StringBuffer();

		for (int i = length - 1; i >= 0; i--) {
			revsersString.append(str.charAt(i));
		}
		System.out.println(revsersString);
	}

	/**
	 * Complexity Analysis Time complexity : O(N) complexity to swap N/2 element.
	 * Space complexity : O(1), it's a constant space solution.
	 * 
	 **/
	private static void approch2(String str) {
		char[] charArray = str.toCharArray();

		int left = 0;
		int right = charArray.length - 1;
		char temp;

		while (left < right) { // in case even and odd length it will work
			temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		String string = String.valueOf(charArray);
		System.out.println(string);
	}

	private static void approch2b(String str) {
		char[] charArray = str.toCharArray();
		char temp;

		for (int left = 0, right = charArray.length - 1; left < right; left++, right--) {
			temp = charArray[right];
			charArray[right] = charArray[left];
			charArray[left] = temp;
		}

		String string = String.valueOf(charArray);
		System.out.println(string);
	}

	private static void approch1(String str) {

	}

}
