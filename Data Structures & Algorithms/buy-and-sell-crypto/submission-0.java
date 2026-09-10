class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min=prices[0];
        int max=prices[0];
        for(int i=0;i<prices.length;i++){
            min = Math.min(prices[i],min);
            if(prices[i]>min){
                ans = Math.max(ans,prices[i]-min);
            }
        }
        return ans;
    }
}
