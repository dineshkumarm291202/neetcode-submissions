class Solution {

    int count = 0;

    public int goodNodes(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        dfs(root, path);
        return count;
    }

    private void dfs(TreeNode node, List<Integer> path) {

        if (node == null) {
            return;
        }

        path.add(node.val);

        // Find maximum in the entire path
        int max = Integer.MIN_VALUE;

        for (int value : path) {
            max = Math.max(max, value);
        }

        // Check if current node is good
        if (node.val >= max) {
            count++;
        }

        dfs(node.left, path);
        dfs(node.right, path);

        // Remove current node when going back
        path.remove(path.size() - 1);
    }
}