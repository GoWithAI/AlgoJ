package string.duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	static String str = "abbccceeeeedddddddd";// abcde

	public static void main(String[] args) {
		// withSet();
		// java9();
		// java8();
		//withoutPredefinedFun();
		withoutPredefinedFun2();
	}

	//if sorted
	private static void withoutPredefinedFun2() {
		char[] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (int i = 1; i < charArray.length - 1; i++) {

			if(charArray[i-1] != charArray[i] && i == 1) {
				sb.append(charArray[i-1]);
			}
			
			if (charArray[i-1] != charArray[i]) {
				sb.append(charArray[i]);
			}

		}
		System.out.println(" sb -> "+sb);

	}

	private static void withoutPredefinedFun() {

		char[] charArray = str.toCharArray();

		char[] newCharArr = new char[27];

		for (int i = 0; i < charArray.length; i++) {
			newCharArr[charArray[i] - 'a']++;
		}

		for (int i = 0; i < newCharArr.length; i++) {
			if (newCharArr[i] > 0) {
				System.out.println((char) (i + 'a'));
			}
		}

	}

	public static void withSet() {
		char[] charArray = str.toCharArray();
		Set<Character> c = new HashSet<>();
		for (Character character : charArray) {
			c.add(character);
		}
		System.out.println(c);
	}

	public static void java9() {
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println(sb);
	}

	public static void java8() {
		Set<String> collect = Arrays.stream(str.split("")).collect(Collectors.toSet());
		System.out.println(collect);
	}
}
