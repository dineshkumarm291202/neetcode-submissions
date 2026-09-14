class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int num = nums[mid];
            if(num==target)return mid;
            if(target>num)start = mid+1;
            if(target<num)end = mid-1;
        }
        return -1;
    }
}
