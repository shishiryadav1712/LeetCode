// Spiral Matrix II
class Solution {
    public int[][] generateMatrix(int n) {
        int [][] result=new int[n][n];
        int count=1;
            int rowStart=0;
            int rowEnd=n-1;
            int colStart=0;
            int colEnd=n-1;
        if(n==0){
            return result;
        }
        while(colStart<=colEnd && rowStart<=rowEnd){
            
                for(int j=colStart; j<=colEnd;j++){
                    result[rowStart][j]=count;
                    count=count+1;
                }rowStart++;

                for(int i=rowStart; i<=rowEnd;i++){
                    result[i][colEnd]=count;
                    count=count+1;
                }colEnd--;

                if(rowStart<=rowEnd){
                    for(int j=colEnd;j>=colStart;j--){
                        result[rowEnd][j]=count;
                        count++;
                    }rowEnd--;
                }
                if(colStart<=colEnd){
                    for(int i=rowEnd;i>=rowStart;i--){
                        result[i][colStart]=count;
                        count++;
                    }
                    colStart++;
                }

            
        }
        return result;
    }
}