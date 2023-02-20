package datastructures.linkedlist;

public class ReverseLinkedListTest {

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	Node head;

	public static void main(String[] args) {

	}

	public Node reverse2(Node head) {

		Node curr = head;
		Node prev = null;

		while (curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = curr;
		return head;
	}

}
