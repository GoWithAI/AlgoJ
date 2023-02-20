package datastructures.linkedlist;

public class DisplayLLNodeEx {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void display(Node head) {
		System.out.println(head.data);
		while (head.next != null) {
			head = head.next;
			System.out.println(head.data);
		}
	}

	public static void main(String[] args) {

		Node n = new Node(1);
		n.next = new Node(2);

		n.next.next = new Node(3);
		n.next.next.next = new Node(4);
		n.next.next.next.next = new Node(5);
		n.next.next.next.next.next = new Node(6);
		n.next.next.next.next.next.next = new Node(7);

		display(n);
	}

}
