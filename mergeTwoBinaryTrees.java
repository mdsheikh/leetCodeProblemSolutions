// definition of binary tree

// class TreeNode{
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(){}
//     TreeNode(int val){
//         this.val = val;
//     }
//     TreeNode(TreeNode left, TreeNode right, int val){
//         this.val = val;
//         this.right = right;
//         this.val = val;
//     }
// }
// /**
//  * mergeTwoBinaryTrees
//  */
public class mergeTwoBinaryTrees {

    public static mergeTrees(TreeNode t1, TreeNode t2){
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        
        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = mergeTrees(t1.left, t2.left);
        node.right = mergeTrees(t2.right, t2.right);

        return node;



    }
}