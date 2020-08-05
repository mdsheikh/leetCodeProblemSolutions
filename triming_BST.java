// definition of a sinary search tree
//     public class TreeNode{
//         int val;
//         TreeNode left;
//         TreeNode right;
//         TreeNode(){}
//         TreeNode(int val){
//             this.val = val;
//         }
//         TreeNode(TreeNode left, TreeNode right, int val){
//             this.val = val;
//             this.left  = left;
//             this.right = right;
//         }
//  }

public class triming_BST {

    public TreeNode trim_BST(TreeNode root, int L, int R) {
        root.left = trim_BST(root.left, L, R);
        root.right = trim_BST(root.right, L, R);
        if (root.val > R)
            return root.right;
        if (root.val < L)
            return root.left;
        return root;

    }

}