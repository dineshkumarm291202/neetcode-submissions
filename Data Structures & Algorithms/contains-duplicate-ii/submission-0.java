class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(hm.containsKey(a)){
                int index=hm.get(a);
                int diff = Math.abs(index-i);
                if(diff<=k)return true;
                else hm.put(a,i);
            }else{
                hm.put(a,i);
            }
        }
        return false;
    }
}