class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //int lr = 0;
        //int lc = 0;
        int l = 0;
        int r = matrix[0].length * matrix.length - 1;
        //int rr = matrix.length - 1;
        //int rc = matrix[0].length - 1;

        //while(lc + lr * matrix[0].length <= rc + rr * matrix.length){
        while(l <= r){
            //int m = (lc + lr * matrix[0].length + rc + rr * matrix[0].length) / 2;
            int m = (l + r) / 2;
            int mr = m / matrix[0].length;
            int mc = m % matrix[0].length;
            //System.out.println("M " + mr + " " + mc);

            if(matrix[mr][mc] < target){
                l = m + 1;
                //lr = l / matrix.length;
                //lc = l % matrix[0].length;
                //System.out.println("L " + lr + " " + lc);
            }
            else if(matrix[mr][mc] > target){
                r = m - 1;
                //rr = r / matrix.length;
                //rc = r % matrix[0].length;
                //System.out.println("R " + rr + " " + rc);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
