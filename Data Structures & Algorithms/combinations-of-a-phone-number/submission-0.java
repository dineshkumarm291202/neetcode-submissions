
class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return ans;
        }

        char[][] map = {
            {},
            {},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
        };

        ans.add("");

        for (int i = 0; i < digits.length(); i++) {

            char[] letters = map[digits.charAt(i) - '0'];
            List<String> temp = new ArrayList<>();

            for (int j = 0; j < ans.size(); j++) {

                for (int k = 0; k < letters.length; k++) {
                    temp.add(ans.get(j) + letters[k]);
                }
            }

            ans = temp;
        }

        return ans;
    }
}