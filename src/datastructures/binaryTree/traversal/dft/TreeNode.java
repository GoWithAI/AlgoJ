package datastructures.binaryTree.traversal.dft;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public static TreeNode getTreeWithData() {
		TreeNode tree = new TreeNode();
		tree.val = 1;
		tree.left =  new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left =  new TreeNode(4);
		tree.left.right =  new TreeNode(5);
		tree.right.left =  new TreeNode(6);
		return tree;
	}
}
