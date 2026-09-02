class Solution {
    public boolean isValidSudoku(char[][] board) {

            // row
            for (int i = 0; i < board.length; i++) {
                Set<Character> seen = new HashSet<>();
                for (int j = 0; j < board[0].length; j++) {
                    if(board[i][j] == '.') continue;
                    if(seen.contains(board[i][j])) return false;
                    seen.add(board[i][j]);
                }
            }

            //  column wise
            for (int j = 0; j < board[0].length; j++) {
                Set<Character> seen = new HashSet<>();
                for (int i = 0; i < board.length; i++) {
                    if(board[i][j] == '.') continue;
                    if(seen.contains(board[i][j])) return false;
                    seen.add(board[i][j]);
                }
            }

            // 3x3 square box
            for (int box = 0; box < 9; box++) {
                Set<Character> seen = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int row = (box / 3) * 3 + i;
                        int col = (box % 3) * 3 + j;
                        if(board[row][col]=='.') continue;
                        if(seen.contains(board[row][col])) return false;
                        seen.add(board[row][col]);
                    }
                }
                
            }
    
            return true;
        }
}
