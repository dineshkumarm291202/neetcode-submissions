class Solution {
     List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        solve(nums, used, new ArrayList<>());

        return ans;
    }

    public void solve(int[] nums, boolean[] used, ArrayList<Integer> al) {

        if (al.size() == nums.length) {
            ans.add(new ArrayList<>(al));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            al.add(nums[i]);

            solve(nums, used, al);

            al.remove(al.size() - 1);
            used[i] = false;
        }
    }
}