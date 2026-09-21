class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(new StringBuilder(),0,0,n);
        return ans;
    }

    public void generate(StringBuilder current, int open,int close,int n){
        if(current.length()==2*n){
            ans.add(current.toString());
            return;
        }
        if(open<n){
            current.append("(");
            generate(current,open+1,close,n);
            current.deleteCharAt(current.length() - 1);
        }
        if(close<open){
            current.append(")");
            generate(current,open,close+1,n);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
