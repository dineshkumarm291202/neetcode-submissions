class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find the '#'
            int j = str.indexOf('#', i);

            // Get the length of the string
            int length = Integer.parseInt(str.substring(i, j));

            // Get the actual string
            String word = str.substring(j + 1, j + 1 + length);

            list.add(word);

            // Move to the next encoded string
            i = j + 1 + length;
        }

        return list;
    }
}