class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] array = new boolean[nums.length];
        permutation(nums,array,new ArrayList<>());
        return ans;
    }

    public void permutation(int[] nums, boolean[] array,ArrayList<Integer> al){
        if(al.size()==nums.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(array[i]==true)continue;
            al.add(nums[i]);
            array[i]=true;
            permutation(nums,array,al);
            array[i]=false;
            al.remove(al.size()-1);
        }
    }
}
