class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid =0;
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            mid = start+(end-start)/2;
            int num = nums[mid];
            if(num==target)return mid;
            if(target>num)start = mid+1;
            if(target<num)end = mid-1;
        }
        return start;
    }
}