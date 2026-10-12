class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length; 
        int n = nums.length;
        rotateArray(nums,0,n-1);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,n-1);
    }
    private void rotateArray(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}