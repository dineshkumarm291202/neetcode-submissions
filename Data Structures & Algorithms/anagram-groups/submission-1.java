class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){

            int[] count = new int[26];

            for(char str : strs[i].toCharArray()){
                count[str - 'a'] = count[str - 'a'] + 1;
            }

            String key = Arrays.toString(count);

            map.computeIfAbsent(key, k -> new ArrayList<>())
               .add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}