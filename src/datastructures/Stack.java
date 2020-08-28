package datastructures;

import java.util.EmptyStackException;

//Stack Using Linked List
public class Stack {

	private class Node {
		private int data;
		private Node next;

		private Node(int data) {
			this.data = data;
		}
	}

	private Node head;

	public boolean isEmpty() {
		return head == null;
	}

	public int peek() {
		return head.data;
	}

	public void push(int data) {
		// Create Node
		// add head.next ref. to new node
		// set current head node addr. head.next to new node

		Node currentNode = new Node(data);
		currentNode.next = head;
		head = currentNode;
	}

	public int pop() {
		if (head == null)
			throw new EmptyStackException();

		int data = head.data;
		head = head.next;
		return data;
	}
}
