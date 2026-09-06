class Solution {
      int finalanswer = 0;
    public int subsetXORSum(int[] nums) {
        int xor =0;
        solveSubset(nums,0,0);
        return finalanswer;
    }
     public void solveSubset(int[] nums, int index,int xor){
        if(index==nums.length){
            finalanswer+=xor;
            return;
        }
        solveSubset(nums,index+1,xor);
        xor=xor^nums[index];
        solveSubset(nums,index+1,xor);
        xor=xor^nums[index];
    }
}