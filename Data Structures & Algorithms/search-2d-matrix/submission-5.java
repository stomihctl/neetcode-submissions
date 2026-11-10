class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix[0].length * matrix.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            int mr = m / matrix[0].length;
            int mc = m % matrix[0].length;

            if(matrix[mr][mc] < target){
                l = m + 1;
            }
            else if(matrix[mr][mc] > target){
                r = m - 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
