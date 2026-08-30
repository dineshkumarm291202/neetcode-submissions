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
    public int goodNodes(TreeNode root) {
        return countGoodOnes(root,root.val);
    }
    public int countGoodOnes(TreeNode root, int maxSoFar){
        if(root==null)return 0;
        int count =0;
        if(root.val>=maxSoFar){
            count = 1;
        }
        maxSoFar = Math.max(root.val,maxSoFar);
        count+=countGoodOnes(root.left,maxSoFar);
        count+=countGoodOnes(root.right,maxSoFar);
        return count;
    }
}
