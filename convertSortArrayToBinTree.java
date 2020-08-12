import javax.swing.tree.TreeNode;

import jdk.nashorn.api.tree.Tree;

// definition of a binary tree 
// class TreeNode{
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(){}
//     TreeNode(int val){
//         this.val = val;
//     }
//     TreeNode(TreeNode left, TreeNode right, int val) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }

// }

/**
 * convertSortArrayToBinTree
 */
public class convertSortArrayToBinTree {
    public static TreeNode(int[] nums){
        if(nums.lenght == 0){
            return null;
        }
        return helper(nums, 0, nums.length -1);

    }

    public int helper(int[] num, int begin, int end) {
        if (begin > end) {
            return null;
        }

        int mid = begin + (end - begin) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, begin, mid - 1);
        node.right = helper(num, mid + 1, end);
        return node;

    }

}