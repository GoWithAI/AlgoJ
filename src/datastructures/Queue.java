package datastructures;

public class Queue {

	private class Node {
		private int data;
		private Node next;

		private Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;

	public boolean isEmpty() {
		return head == null;
	}

	public int peek() {
		return head.data;
	}

	public void add(int data) {

		Node newNode = new Node(data);

		if (tail != null) {
			tail.next = newNode;
		}
		tail = newNode;

		// if head is null or adding first element
		if (head == null)
			head = newNode;
	}

	public int remove() {

		int data = head.data;
		// remove first element in linked list
		head = head.next;

		// if head is null means nothing to remove
		if (head == null)
			tail = null;

		return data;
	}

}
