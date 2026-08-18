class MyHashMap {

    ArrayList<int[]> list;

    public MyHashMap() {
        list = new ArrayList<>();
    }

    public void put(int key, int value) {

        for (int[] pair : list) {

            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        }

        list.add(new int[]{key, value});
    }

    public int get(int key) {

        for (int[] pair : list) {

            if (pair[0] == key) {
                return pair[1];
            }
        }

        return -1;
    }

    public void remove(int key) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i)[0] == key) {
                list.remove(i);
                return;
            }
        }
    }
}