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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return tree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode tree(int[] preorder,int[] inorder,int s1,int e1,int s2, int e2){
        if(s1>e1)return null;
        TreeNode newNode = new TreeNode(preorder[s1]);
        int idx = -1;
        for(int i=s2;i<=e2;i++){
            if(inorder[i]==preorder[s1]){
                idx = i;
                break;
            }
        }
        int count = idx-s2;
        newNode.left= tree(preorder,inorder,s1+1,s1+count,s2,idx-1);
        newNode.right= tree(preorder,inorder,s1+count+1,e1,idx+1,e2);
        return newNode;
    }
}
