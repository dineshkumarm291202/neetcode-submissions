class Solution {

    public boolean exist(char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;

        boolean[][] visited = new boolean[n][m];

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < m; col++) {

                if (solve(board, visited, word, 0, row, col)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean solve(char[][] board,
                         boolean[][] visited,
                         String word,
                         int count,
                         int row,
                         int col) {

        // Word is completely matched
        if (count == word.length()) {
            return true;
        }

        // Out of bounds
        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length) {
            return false;
        }

        // Cell already used in current path
        if (visited[row][col]) {
            return false;
        }

        // Current character doesn't match
        if (board[row][col] != word.charAt(count)) {
            return false;
        }

        // Mark current cell as visited
        visited[row][col] = true;

        // Explore all 4 directions
        boolean found =
                solve(board, visited, word, count + 1, row - 1, col) || // Up
                solve(board, visited, word, count + 1, row + 1, col) || // Down
                solve(board, visited, word, count + 1, row, col - 1) || // Left
                solve(board, visited, word, count + 1, row, col + 1);   // Right

        // Backtrack
        visited[row][col] = false;

        return found;
    }
}