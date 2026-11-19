class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum =0;
        int ans = Integer.MAX_VALUE;
        while(right < nums.length || sum >= target){
            if(sum>=target){
               ans = Math.min(ans, right - left);
                sum=sum-nums[left];
                left++;
            }else if(sum<target){
                sum+=nums[right];
                right++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}