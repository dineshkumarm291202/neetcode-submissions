class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        combination(1,n,k,new ArrayList<Integer>());
        return ans;
    }

    public void combination(int start,int n,int k, ArrayList<Integer> al){
        
        if(al.size()==k){
            ans.add(new ArrayList<>(al));
            return;
        }
        if(start>n)return;
        combination(start+1,n,k,al);
        al.add(start);
        combination(start+1,n,k,al);
        al.remove(al.size()-1);
    }
}