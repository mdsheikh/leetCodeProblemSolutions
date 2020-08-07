/**
 * sumOfRootToLeafBN
 */
// definition of binary tree
// class TreeNode{
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(){}
//     TreeNode(int val{
//         this.val = val;
//     }
//     TreeNode(TreeNode left, TreeNode right, int val){
//         this.left = left ;
//         this.right = right;
//         this.val = val;
//     }
// }
public class sumOfRootToLeafBN {
  public int sumRootToLeaf(TreeNode root){
      return sumRootToLeafHelper(root, 0);
  }
  private int sumRootToLeafHelper(TreeNode root, int prevSum){
      if(root == null) return 0;
      prevSum = 2 * prevSum + root.val;
      if(root.left == null && root.right ==  null){
          return prevSum;
      }
      return sumRootToLeafHelper(root.left, prevSum) + sumRootToLeafHelper(root.right, prevSum);
  }
}

private