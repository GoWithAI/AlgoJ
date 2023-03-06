package datastructures.binaryTree.traversal.dft;

public class FindElementInTreeEx {
	static int maxValue = 0;
	static boolean isExist = false;

	public static void main(String[] args) {
		TreeNode tree = TreeNode.getTreeWithData();
		findMaxValue(tree);
		System.out.println(maxValue);

		findGivenValueExist(tree, 6);
		System.out.println(isExist);
	}

	private static void findMaxValue(TreeNode tree) {
		if (tree != null) {
			if (maxValue < tree.val) {
				maxValue = tree.val;
			}
			findMaxValue(tree.left);
			findMaxValue(tree.right);
		}
	}

	private static void findGivenValueExist(TreeNode tree, int i) {
		if (tree != null) {
			if (tree.val == i)
				isExist = true;
			findGivenValueExist(tree.left,i);
			findGivenValueExist(tree.right,i);
		}
	}
}
