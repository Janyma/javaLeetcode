class SudokuSolver_37 {
    public void solveSudoku(char[][] board) {
        if(board==null || board.length==0){
            return ;
        }
        solve(board);
        
    }

    public boolean solve(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='.'){
                    for(char a='1'; a<='9'; a++){
                        if(isValid(board, i, j,a)){
                            board[i][j]=a;
                            if(solve(board)){
                                return true;
                            }else{
                                board[i][j]='.';
                            }
                        }
                    }return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int row, int col, char a){
        for(int i=0; i<9; i++){
            if(board[row][i]!='.' && board[row][i]==a ){
                return false;
            }
            if(board[i][col]!='.' && board[i][col]==a){
                return false;
            }

            if(board[3*(row/3)+i/3][3*(col/3)+i%3]!='.' && board[3*(row/3)+i/3][3*(col/3)+i%3]==a){
                return false;
            }
        }
        return true;
    }
}