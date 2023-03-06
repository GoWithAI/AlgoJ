package datastructures.binaryTree.traversal.dft;

import java.util.ArrayList;
import java.util.List;

// Pre / In / Post order traversing with Recursion 
public class TraversingTreePrePostInOrder {
	static List<Integer> preOrder = new ArrayList();
	static List<Integer> InOrder = new ArrayList();
	static List<Integer> postOrder = new ArrayList();

	public static void main(String[] args) {
		TreeNode tree = TreeNode.getTreeWithData();
		traversePreorder(tree);
		System.out.println(preOrder);
		traverseInorder(tree);
		System.out.println(InOrder);
		traversePostorder(tree);
		System.out.println(postOrder);

	}

	private static void traversePreorder(TreeNode tree) {
		if (tree != null) {
			preOrder.add(tree.val);
			traversePreorder(tree.left);
			traversePreorder(tree.right);
		}
	}

	private static void traverseInorder(TreeNode tree) {
		if (tree != null) {
			traverseInorder(tree.left);
			InOrder.add(tree.val);
			traverseInorder(tree.right);
		}
	}

	private static void traversePostorder(TreeNode tree) {
		if (tree != null) {
			traversePostorder(tree.left);
			traversePostorder(tree.right);
			postOrder.add(tree.val);
		}
	}
}
