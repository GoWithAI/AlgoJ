package algorithm_pratice;

public class Palindrom {

	public static void main(String[] args) {
		boolean value = isPalindrome("aba");
		System.out.println(value);

	}

	public static boolean isPalindrome(String word) {

		char[] charArray = word.toCharArray();
		for (int start = 0, end = word.length() - 1; start < end; ++start, --end) {
			if (charArray[start] != charArray[end])
				return false;
		}
		return true;
	}

	public boolean isPalindrome2(String word) {
		StringBuilder sb = new StringBuilder(word);
		String reverseWord = sb.reverse().toString();
		return word.equals(reverseWord);
	}

	public boolean isPalindrome3(String word) {
		for (int start = 0, end = word.length() - 1; start < end; ++start, --end) {
			if (word.charAt(start) != word.charAt(end))
				return false;
		}
		return true;
	}

}
