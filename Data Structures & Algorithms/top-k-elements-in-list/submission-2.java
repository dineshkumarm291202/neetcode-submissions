class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Max Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>(
                    (a, b) -> b.getValue() - a.getValue()
                );

        // 3. Add all elements
        pq.addAll(map.entrySet());

        // 4. Get top K elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}