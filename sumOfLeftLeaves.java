// definition of a binary  tree
// class TreeNode{
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(){}
//     TreeNode(int val){
//         this.val = val;
//     }
//     TreeNode(TreeNode left, TreeNode right, int val){
//         this.left = left;
//         this.right = right;
//         this.val = val;
//     }
// }

public class sumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        } else {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }

}