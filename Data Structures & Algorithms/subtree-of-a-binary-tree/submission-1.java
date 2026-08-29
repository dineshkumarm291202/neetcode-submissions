/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    TreeNode first = null;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return traversal(root,subRoot);

    }
    public boolean traversal(TreeNode root,TreeNode subRoot){
       if (root == null) { return false; } // Found a node with the same value
    if (root.val == subRoot.val) { // Check whether the complete trees are same 
    if (isSameTree(root, subRoot)) { return true; } } // Search left and right 
    return traversal(root.left, subRoot) || traversal(root.right, subRoot);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if(p==null && q!=null)return false;
        if(p!=null && q==null)return false;
        if(p.val!=q.val)return false;
        return isSameTree(p.left, q.left)
        && isSameTree(p.right, q.right);
    }

}
