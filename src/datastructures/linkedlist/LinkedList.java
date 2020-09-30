package datastructures.linkedlist;

//No random access of Node possible
// No Indexes , No Fixed capacity

/**
 * Disadvantages : No Random Access( required to traverse ) Get/Set is linear or
 * O(n)
 * 
 * Advantages : Super fast Insert/Delete O(1) can grow incrementally
 * 
 */
//Single LinkedList
public class LinkedList {

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	// head is first node / head is first node address
	private Node head;
	private int size;

	// Add Front O(1)
	public void addFront(int data) {
		// Create new node
		Node newNode = new Node(data);

		// if head head is null - LinkedList without any data,not any node
		if (head == null) {
			head = newNode;
			return;
		}

		// set new node next to current Head
		newNode.next = head;

		// set current head pointing to new node(set current head be the new head)
		head = newNode;
		size++;
	}

	public int getFirst() {
		// if head != null
		return head.data;
	}

	// Traverse Linked List
	public int getLast() {
		if (head == null)
			throw new IllegalStateException("Empty List");

		Node currentNode = head;

		// traverse list until we are not at the tail
		while (currentNode.next != null)
			currentNode = currentNode.next; // O(n)

		// traverseNode(currentNode);
		// we are at the tail/last node
		return currentNode.data;
	}

	// If Common method used getting issue - Go through After
	private void traverseNode(Node currentNode) {
		// traverse list until we are not at the tail
		while (currentNode.next != null) {
			currentNode = currentNode.next; // O(n)
		}
	}

	// Add Back O(n)
	public void addBack(int data) {
		// Create new Node which will getting added at last
		Node newNode = new Node(data);

		// if head is null: no linkedlist is empty
		if (head == null) {
			head = newNode;
			return;
		}

		// Traverse Linked List upto the last name
		Node currentNode = head;
		// traverseNode(currentNode);
		while (currentNode.next != null)
			currentNode = currentNode.next; // O(n)

		currentNode.next = newNode;
		size++;
	}

	// O(n)
	public void delete(int data) {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (head.data == data) {
			head = head.next;
			return;
		}

		Node currentNode = head;

		while (currentNode.next != null) {
			if (currentNode.next.data == data) {
				currentNode.next = currentNode.next.next;
				/*
				 * Node nodeToBeDeleted = currentNode.next; currentNode.next =
				 * nodeToBeDeleted.next;
				 */
				return;
			}
			currentNode = currentNode.next;
		}

	}

	// not best approach
	public int size() {
		if (head == null)
			return 0;

		int count = 1;
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
			count++;
		}
		return count;
	}

	// All other Node by default dereferencing them they get targetted for garbage
	// collection
	public void clear() {
		head = null;
	}

	// for small testing purpose only
	public boolean contains(int data) {

		Node currentNode = head;
		if (currentNode.data == data)
			return true;

		while (currentNode.next != null) {
			if (currentNode.next.data == data)
				return true;
			currentNode = currentNode.next;
		}
		return false;
	}

	public Node reverse(Node node) {
		Node prev = null;
		Node next = null;
		Node current = node;

		while (current != null) {
			next = current.next;
			current.next = prev;
			current = next;
			prev = current;
		}

		return node;
	}
}
