class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        if (s.length() != t.length()) {
    return false;
}
        for(int i=0;i<s.length();i++){
            int count = hm.getOrDefault(s.charAt(i),0);
            hm.put(s.charAt(i),count+1);
        }
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))){
                int count = hm.get(t.charAt(i))-1;
                if(count==0)hm.remove(t.charAt(i));
                 else {
                    hm.put(t.charAt(i), count);
                }
            }
        }
        if(hm.isEmpty())return true;
        return false;
    }
}
