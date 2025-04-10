// Set Matrix Zeroes
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        boolean rowhasZero=false;
        boolean colhasZero=false;
         for(int col=0;col<cols;col++){
            if(matrix[0][col]==0){
                rowhasZero=true;
                break;
            }
         }
         for(int row=0;row<rows;row++){
            if(matrix[row][0]==0){
                colhasZero=true;
                break;
            }
         }

         for(int row=1;row<rows;row++){
            for(int col=1;col<cols;col++){
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
         }

         for(int row=1;row<rows;row++){
            for(int col=1;col<cols;col++){
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
         }

         if(colhasZero){
            for(int row=0;row<rows;row++){
                matrix[row][0]=0;
            }
         }

         if(rowhasZero){
            for(int col=0;col<cols;col++){
                matrix[0][col]=0;
            }
         }
        
    }
}