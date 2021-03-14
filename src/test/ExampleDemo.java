package test;

public class ExampleDemo {

	class Node {
		int data;

		Node head;
		Node next;

		public Node() {
			
		}
		
		Node(int data, Node node) {
			this.data = data;
			this.next = node;
		}

	}

	static Node originalStrLL;
	static Node validateStrLL;

	public static void main(String[] args) {

		String str = "abcd";
		String str2 = "bcda";
		findRotation(str, str2);

		convertStringToLLNode(str, str);

	}

	private static void convertStringToLLNode(String str, String str2) {

		char[] charArray = str.toCharArray();
		char[] charArray2 = str2.toCharArray();

		int i = 0;
		while (charArray.length != 0) {

			char c = charArray[i];
			

		}

	}

	private static void findRotation(String orginalStr, String validateString) {

	}

}
