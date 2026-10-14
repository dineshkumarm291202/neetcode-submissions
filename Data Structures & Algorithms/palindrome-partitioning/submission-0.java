class Solution {
   List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        palindromePartition(ans,s,0,new ArrayList<String>());
        return ans;
    }
    public void palindromePartition(List<List<String>> ans, String s, int index, ArrayList<String> al ){
        if(index==s.length()){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i =index;i<s.length();i++ ){
            if(isPalindrome(s,index,i)){
                al.add(s.substring(index,i+1));
                palindromePartition(ans,s,i+1,al);
                al.remove(al.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }

}
