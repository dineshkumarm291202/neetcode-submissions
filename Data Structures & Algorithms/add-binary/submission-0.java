class Solution {
    public String addBinary(String a, String b) {
     StringBuilder ans = new StringBuilder();

        int n = a.length() - 1;
        int m = b.length() - 1;

        int carry = 0;

        while (n >= 0 || m >= 0) {

            int c = 0;
            int d = 0;

            if (n >= 0) {
                c = a.charAt(n) - '0';
            }

            if (m >= 0) {
                d = b.charAt(m) - '0';
            }

            int current = c + d + carry;

            if (current == 0) {
                ans.append("0");
                carry = 0;
            }

            if (current == 1) {
                ans.append("1");
                carry = 0;
            }

            if (current == 2) {
                ans.append("0");
                carry = 1;
            }

            if (current == 3) {
                ans.append("1");
                carry = 1;
            }

            n--;
            m--;
        }

        if (carry == 1) {
            ans.append("1");
        }

        return ans.reverse().toString();
    }
}