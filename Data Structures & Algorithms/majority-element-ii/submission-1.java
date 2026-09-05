class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int m = n/3;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<n;i++){
            int curr = nums[i];
            int count = hm.getOrDefault(curr,0);
            count++;
            hm.put(curr,count);
        }
        List<Integer> al = new ArrayList<>();
        for(Map.Entry<Integer,Integer> num : hm.entrySet()){
            if(num.getValue()>m)al.add(num.getKey());
        }
        return al;
    }
}