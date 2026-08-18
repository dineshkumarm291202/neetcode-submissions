class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String smallest = "";
        String largest ="";
        String ans = "";
        if(str1.length()<str2.length()){
            smallest = str1;
            largest = str2;
        }
        else {
            smallest = str2;
            largest = str1;
            }
        boolean flag = true;
        int i =1;
 // If they are made from the same base string,
        // str1 + str2 must be equal to str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}