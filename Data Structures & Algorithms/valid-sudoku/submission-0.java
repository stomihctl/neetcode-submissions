class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Integer>> row = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            row.add(new HashSet<>());
        }
        List<Set<Integer>> col = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            col.add(new HashSet<>());
        }
        List<Set<Integer>> box = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            box.add(new HashSet<>());
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(row.get(i).contains(board[i][j] - 1) || col.get(j).contains(board[i][j] - 1) || box.get((int)Math.floor(i / 3) * 3 + (int)Math.floor(j / 3)).contains(board[i][j] - 1)){
                        return false;
                        
                    }
                    else{
                        row.get(i).add(board[i][j] - 1);
                        col.get(j).add(board[i][j] - 1);
                        box.get((int)Math.floor(i / 3) * 3 + (int)Math.floor(j / 3)).add(board[i][j] - 1);
                    }

                }
            }
        }
        return true;
    }
}
