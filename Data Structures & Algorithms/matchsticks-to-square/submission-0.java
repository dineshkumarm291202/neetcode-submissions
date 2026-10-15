class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for(int val: matchsticks){
            sum+=val;
        }
        if(sum%4!=0)return false;
Arrays.sort(matchsticks);
for (int i = 0; i < matchsticks.length / 2; i++) {
    int temp = matchsticks[i];
    matchsticks[i] = matchsticks[matchsticks.length - 1 - i];
    matchsticks[matchsticks.length - 1 - i] = temp;
}        int[] side = new int[4];
        return backtrack(matchsticks,0,side,sum/4);
    }

    public boolean backtrack(int[] matchsticks,int index,int[] side, int target){
        if(index==matchsticks.length){
            return side[0]==target && side[1]==target && side[2]==target && side[3]==target;
        }
        for(int i = 0;i<4;i++){
            if(side[i]+matchsticks[index]<=target){
                side[i] += matchsticks[index];
                if (backtrack(matchsticks, index + 1, side, target)) {
                    return true;
                }
                side[i] -= matchsticks[index];
            }
            if (side[i] == 0) {
                break;
            }
        }
        return false;
    }
}