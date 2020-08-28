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

	// O(1)
	public void add(int data) {

		Node newNode = new Node(data);

		// if its not first element in list
		if (tail != null) {
			tail.next = newNode;
		}
		//make newly added linked list as tail
		//because newly added node is always Tail node
		tail = newNode;

		// if head is null or adding first element
		if (head == null)
			head = newNode;
	}

	// O(1)
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
