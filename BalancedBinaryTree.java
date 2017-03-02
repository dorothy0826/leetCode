/*package leetCode;

import cPractice.MaxAndMin;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

class TreeSolution{
	public int depth(TreeNode root){
		if (root == null) {
			return 0;
		}else {
			return Math.max(depth(root.left), depth(root.right))+1;
		}
	}
	
	public boolean isBalanced(TreeNode root){
		if (root == null) {
			return true;
		}else {
			int left = depth(root.left);
			int right = depth(root.right);
			return Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right);
		}
	}
}

public class BalancedBinaryTree {

	public static void main(String[] args) {
		
	}

}
*/