class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int ans = 0;
        int n = s.length();
        for(int i =0;i<n;i++){
            for(int j = i;j<n;j++){
                 if (hs.contains(s.charAt(j))) {
                    break;
                }
                hs.add(s.charAt(j));
                ans = Math.max(ans,hs.size());
            }
            hs.clear();
        }
        return ans;
    }
}
