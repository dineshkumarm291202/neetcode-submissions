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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pPath = new ArrayList<>();
        ArrayList<TreeNode> qPath = new ArrayList<>();
        findPath(root,p,pPath);
        findPath(root,q,qPath);
        Collections.reverse(pPath);
        Collections.reverse(qPath);
        int n =pPath.size();
        int m = qPath.size();
        int i =0;
        int j = 0;
        TreeNode ans = null;
        while(i<n && j<m){
           if (pPath.get(i) == qPath.get(j)) { 
            ans = pPath.get(i); 
            } else { 
                break; 
            } 
            i++;
             j++;
        }return ans;
    }
    public boolean findPath(TreeNode root, TreeNode p,ArrayList<TreeNode> al){
        if(root==null)return false;
        if(root==p){
            al.add(p);
            return true;
        }
        if(findPath(root.left,p,al) || findPath(root.right,p,al)){
            al.add(root);
            return true;
        }else return false;
    }
}
