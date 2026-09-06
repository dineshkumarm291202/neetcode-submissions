class Solution {
    public boolean isValidSudoku(char[][] board) {

        int n = board.length;
        int m = board[0].length;

        for(int row = 0; row < n; row++) {

            for(int col = 0; col < m; col++) {

                if(board[row][col] == '.')
                    continue;

                Character ch = board[row][col];

                // Check row
                for(int i = 0; i < n; i++) {
                    if((col != i) && board[row][i] == ch)
                        return false;
                }

                // Check column
                for(int i = 0; i < n; i++) {
                    if((row != i) && board[i][col] == ch)
                        return false;
                }

                // Check 3x3 box
                int startrow = row / 3 * 3;
                int startcol = col / 3 * 3;

                for(int i = startrow; i < startrow + 3; i++) {
                    for(int j = startcol; j < startcol + 3; j++) {

                        if((i != row || j != col) && board[i][j] == ch)
                            return false;
                    }
                }
            }
        }

        return true;
    }
}