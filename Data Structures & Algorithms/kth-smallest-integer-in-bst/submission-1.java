class Solution {

    int count = 0;
    int answer = 0;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return answer;
    }

    public void inOrder(TreeNode root, int k) {

        if (root == null) {
            return;
        }

        inOrder(root.left, k);

        count++;

        if (count == k) {
            answer = root.val;
            return;
        }

        inOrder(root.right, k);
    }
}