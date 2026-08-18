class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==val)continue;
            else al.add(nums[i]);
        }
        Collections.sort(al);
        int n = al.size();
        for(int i =0;i<n;i++){
            nums[i]=al.get(i);
        }
        return n ;
    }
}