class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solveSubset(nums,new ArrayList<Integer>(),0);
        return ans;
    }
    public void solveSubset(int[] nums,ArrayList<Integer> curr, int index){
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        solveSubset(nums,curr,index+1);
        curr.add(nums[index]);
        solveSubset(nums,curr,index+1);
        curr.remove(curr.size()-1);
    }
}
