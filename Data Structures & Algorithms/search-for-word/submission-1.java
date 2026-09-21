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
    public boolean solve(char[][] board,boolean[][] visited, String word,int count,int row,int col){
        if(count==word.length())return true;
        if(row<0 || row>=board.length || col<0 || col>=board[0].length)return false;

        if(visited[row][col])return false;

        if(board[row][col]!=word.charAt(count)){
            return false;
        }
        visited[row][col]=true;

        boolean found = (solve(board,visited,word,count+1,row-1,col) ||                      solve(board,visited,word,count+1,row+1,col)
               ||solve(board,visited,word,count+1,row,col-1)                                  ||solve(board,visited,word,count+1,row,col+1));
               visited[row][col]=false;
               return found;

    }
}
