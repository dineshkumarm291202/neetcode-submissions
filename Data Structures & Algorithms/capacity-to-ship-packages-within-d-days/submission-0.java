class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int start = 0;
        int end = 0;
        int ans = 0;

        for (int num : weights) {
            start = Math.max(start, num);
            end += num;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (check(weights, mid, days)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public boolean check(int[] weights, int mid, int days) {

        int temp = mid;
        int count = 1;

        for (int num : weights) {

            if (num <= temp) {
                temp = temp - num;
            } 
            else {
                count++;
                temp = mid - num;
            }
        }

        return count <= days;
    }
}