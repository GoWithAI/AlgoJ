package commonOperations;

public class BinaryToInteger {

	public static String s = "101";

	public static void main(String[] args) {

		int num = 0;
		
		char[] charArray = s.toCharArray();
		
		for(char c : charArray) {
			int a=Integer.parseInt(String.valueOf(c));  
			num = num * 2 + a;
		}

		System.out.println(num);
	}

}
