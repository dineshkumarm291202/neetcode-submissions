class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int end = 0;
        for(int num: piles){
            end = Math.max(num,end);
        }
        int ans =0;
        int start =1;
        while(start<=end){
            int mid = start+(end-start)/2;
            boolean flag = check(mid,piles,h);
            if(flag){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
     public boolean check(int mid,int[] piles,int h){
        int count =0;
        int n = piles.length;
        int i =0;
        while(i<n){
           count+=piles[i]/mid;
           if(piles[i]%mid!=0)count++;
           i++;
       }
        if(count>h)return false;
        else return true;
    }


}
   