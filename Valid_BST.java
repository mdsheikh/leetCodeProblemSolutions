/**
 * Valid_BST
 * 
 */
// definition of a binary search tree
// public class TreeNode{
// int val;
// TreeNode left;
// TreeNode right;
// // constructors
// TreeNode(){}
// TreeNode(int val){
// this.val = val;
// }
// TreeNode(TreeNode left, TreeNode right, int val){
// this.left = left;
// this.right = right;
// this.val = val;
// }
// }

public class Valid_BST {
    public boolean isValid(TreeNode root) {
        return isValidHelper(root, null, null);

    }

    private boolean isValidHelper(TreeNode root, Integer min, Integer max) {
        if (root == null)
            return true;
        if (min != null && root.val <= min)
            return false;
        if (max != null && root.val >= max)
            return false;
        return isValidHelper(root.left, min, root.val) && isValidHelper(root.right, root.val, max);

    }

}