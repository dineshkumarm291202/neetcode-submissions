class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates,target,0,new ArrayList<>());
        return ans;
    }
    public void solve(int[] candidates, int target,int start, ArrayList<Integer> al){
        if(target==0){
            ans.add(new ArrayList<>(al));
            return;
        }
         if (target < 0) {
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if (i > start && candidates[i] == candidates[i - 1])
    continue;
            al.add(candidates[i]);
            target=target-candidates[i];
            solve(candidates,target,i+1,al);
            al.remove(al.size()-1);
            target=target+candidates[i];
        }
    }
}
