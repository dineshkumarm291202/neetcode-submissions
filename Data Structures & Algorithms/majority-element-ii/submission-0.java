class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int m = n/3;
        HashSet<Integer> ans = new HashSet<>();
        for(int i =0;i<n;i++){
            int curr = nums[i];
            int counter = 0;
            for(int j=0;j<n;j++){
                if(curr==nums[j])counter++;
            }
            if(counter>m)ans.add(nums[i]);
        }
        List<Integer> al = new ArrayList<>();
        for(Integer num : ans){
            al.add(num);
        }
        return al;
    }
}