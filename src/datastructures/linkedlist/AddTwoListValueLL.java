package datastructures.linkedlist;

public class AddTwoListValueLL {
	 Node l1, l2;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static Node traverseAndAddZeroNode(Node l1, Node l2) {
		Node temp1 = l1, temp2 = l2;
		while (temp1 != null && temp2 != null) {
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		// add node in first
		if (temp1 == null && temp2 != null) {
			while (temp2 != null) {
				Node n = new Node(0);
				n.next = temp1;
				l1 = n;
				temp2 = temp2.next;
			}
		}

		if (temp2 == null && temp1 != null) {
			while (temp1 != null) {
				Node n = new Node(0);
				n.next = l2;
				l2 = n;
				temp1 = temp1.next;
			}
		}
		return l2;
		//printList(l2);
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.println(head.data + "|    ");
			head = head.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		AddTwoListValueLL list = new AddTwoListValueLL();
		list.l1 = new Node(7);
		list.l1.next = new Node(5);
		list.l1.next.next = new Node(9);
		list.l1.next.next.next = new Node(4);
		list.l1.next.next.next.next = new Node(6);

		list.l2 = new Node(8);
		list.l2.next = new Node(4);

		 list.l2= traverseAndAddZeroNode(list.l1, list.l2);
		
		printList(list.l2);
	}

}
