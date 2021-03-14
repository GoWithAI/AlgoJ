package datastructures.binaryTree;

/**
 * 1. All Left Nodes are less Than Parent 2. All Right Nodes are grater Than
 * Parent 3. Duplicate key are not allowed, so not required : key == root.key
 * 
 **/
public class BinarySearchTree {

	class Node {
		int key;
		String value;
		Node left, right;

		public Node(int key, String value) {
			super();
			this.key = key;
			this.value = value;
		}

		public Node min() {
			if (left == null)
				return this;
			else
				return left.min();
		}

		public Node max() {
			if (right == null)
				return this;
			else
				return right.max();
		}
	}

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	// O(log n)
	public String find(int key) {

		// Find node by using key
		Node node = find(root, key);
		// return the value
		return node == null ? null : node.value;
	}

	private Node find(Node node, int key) {
		if (node == null || node.key == key)
			return node;
		else if (key < node.key)
			return find(node.left, key); // recursion
		else if (key > node.key)
			return find(node.right, key); // recursion
		return null;
	}

	public void insert(int key, String value) {
		root = insertItem(root, key, value);
	}

	public Node insertItem(Node node, int key, String value) {

		// create new Node
		Node newNode = new Node(key, value);

		// if node is root node
		// if node is null set value
		if (node == null) {
			node = newNode;
			return node;
		}

		// walk unitl you find a node
		if (key < node.key) {
			node.left = insertItem(node.left, key, value);
		} else if (key > node.key) {
			node.right = insertItem(node.right, key, value);
		}
		// we have returned from the bottom
		// return fully constructed tree
		return node;
	}
}
