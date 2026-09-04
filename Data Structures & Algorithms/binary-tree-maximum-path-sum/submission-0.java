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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max(root);
        return max;
    }
    public int max(TreeNode root){
        if(root==null)return 0;
        int left = max(root.left);
        int right = max(root.right);
        int p = root.val + Math.max(left,0)+ Math.max(right,0);
        max = Math.max(max,p);
        return root.val + Math.max(0, Math.max(left, right));
    }
}
