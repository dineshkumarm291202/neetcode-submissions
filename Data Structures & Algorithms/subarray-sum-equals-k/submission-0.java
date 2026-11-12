class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans =0;
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                int value=0;
                if(i==0)value=prefix[j];
                else value = prefix[j]-prefix[i-1];
                if(value==k)ans++;
            }
        }
        return ans;
    }
}