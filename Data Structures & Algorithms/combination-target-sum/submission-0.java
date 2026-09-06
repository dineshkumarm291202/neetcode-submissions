class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        solve(nums,0,target,new ArrayList<>(),0);
        return ans;
    }
    public void solve(int[] nums,int index,int target,ArrayList<Integer> al,int sum){
        if(sum == target) { ans.add(new ArrayList<>(al)); return; }
        if(sum > target || index == nums.length) { return; }
       // Don't take 
       solve(nums, index + 1, target, al, sum); // Take 
       al.add(nums[index]); 
       sum += nums[index]; // Stay at same index because we can reuse the number 
       solve(nums, index, target, al, sum); 
       // Backtrack 
       sum -= nums[index]; al.remove(al.size() - 1);
    }
}
