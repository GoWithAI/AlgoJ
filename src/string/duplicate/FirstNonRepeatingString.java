package string.duplicate;

import java.util.HashMap;
import java.util.Map;

class FirstNonRepeatingString {
	public static void main(String[] args) {
		firstUniqChar("leetcodeo");
		//byUsingAlphaArray();
	}

	private static void byUsingAlphaArray() {
		char[] c = "leet".toCharArray();
		char[] alpha = new char[26];
		for (int i = 0; i < c.length; i++) {
			System.out.println((c[i] - 97));
			alpha[(c[i] - 97)]++;
		}

		int index = 0;
		for (char c1 : c) {
			if (alpha[( c1-97)] == 1) {
				System.out.println(index);
			}
			index++;
		}
		System.out.println(index);
	}

	public static int firstUniqChar(String s) {

		Map<Character, Integer> map = new HashMap<>();
		int strLength = s.length();

		for (int i = 0; i < strLength; i++) {
			char c = s.charAt(i);
			System.out.print(map.get(c) +" ");
			int value = map.get(c) == null ? 0 : (map.get(c) + 1);
			map.put(c, value);
		}
		System.out.println(map);
		for (int i = 0; i < strLength; i++) {
			System.out.println(i);
			if (map.get(s.charAt(i)) == 0)
				return i;
		}
		
		return map.size();
	}
}