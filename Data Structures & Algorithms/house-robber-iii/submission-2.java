class Solution {

    class Pair {
        int rob;
        int skip;

        Pair(int rob, int skip) {
            this.rob = rob;
            this.skip = skip;
        }
    }

    public int rob(TreeNode root) {
        Pair result = solve(root);

        return Math.max(result.rob, result.skip);
    }

    private Pair solve(TreeNode root) {

        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = solve(root.left);
        Pair right = solve(root.right);

        int robCurrent =
                root.val + left.skip + right.skip;

        int skipCurrent =
                Math.max(left.rob, left.skip)
                + Math.max(right.rob, right.skip);

        return new Pair(robCurrent, skipCurrent);
    }
}