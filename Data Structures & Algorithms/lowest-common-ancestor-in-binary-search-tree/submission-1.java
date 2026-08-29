
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // Base case
        if (root == null) {
            return null;
        }

        // Found p or q
        if (root == p || root == q) {
            return root;
        }

        // Search left and right
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // p and q found on different sides
        if (left != null && right != null) {
            return root;
        }

        // Only one side contains p or q
        if (left != null) {
            return left;
        }

        return right;
    }
}
//"I found one target somewhere below my left side and the other target somewhere below my right side. Therefore, I am the first node where they meet — so I am their Lowest Common Ancestor."

