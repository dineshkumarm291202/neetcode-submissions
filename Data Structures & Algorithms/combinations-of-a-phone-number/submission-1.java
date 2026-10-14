class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return ans;
        }

        char[][] map = {
            {},                         // 0
            {},                         // 1
            {'a', 'b', 'c'},            // 2
            {'d', 'e', 'f'},            // 3
            {'g', 'h', 'i'},            // 4
            {'j', 'k', 'l'},            // 5
            {'m', 'n', 'o'},            // 6
            {'p', 'q', 'r', 's'},       // 7
            {'t', 'u', 'v'},            // 8
            {'w', 'x', 'y', 'z'}        // 9
        };

        backtrack(ans, map, digits, 0, "");

        return ans;
    }

    public void backtrack(
        List<String> ans,
        char[][] map,
        String digits,
        int index,
        String current
    ) {

        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        char[] letters = map[digits.charAt(index) - '0'];

        for (char ch : letters) {
            backtrack(ans, map, digits, index + 1, current + ch);
        }
    }
}