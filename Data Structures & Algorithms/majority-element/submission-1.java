class Solution {
    public int majorityElement(int[] nums) {
        Integer majorityElement = null;
        int count =0;
       for(int i =0;i<nums.length;i++){
            if(majorityElement==null){
                majorityElement = nums[i];
                count++;
            }else{
                if(majorityElement==nums[i])
                count++;
                else{
                    count--;
                    if(count==0)majorityElement=null;
                }
            }
       } 
       return majorityElement;
       
    }
}