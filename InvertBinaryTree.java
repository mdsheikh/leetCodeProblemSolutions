
public class InvertBinaryTree {
    int val;
    InvertBinaryTree left;
    InvertBinaryTree right;
    InvertBinaryTree() {}
    InvertBinaryTree(int val) { this.val = val; }
    InvertBinaryTree(int val, InvertBinaryTree left, InvertBinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public InvertBinaryTree invertTree(InvertBinaryTree root) {
        if(root == null){
            return null;
        }
        // recursive calls
        invertTree(root.left);
        invertTree(root.right);

        // swapping 
        InvertBinaryTree temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        return root;
        


    }
    public static void main(String[] args) {
        
        
    }
    
}
