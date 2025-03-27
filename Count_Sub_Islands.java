// Count Sub Islands
class Solution {
  
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int rows = grid1.length;    
        int cols = grid1[0].length; 
        int subIslandsCount = 0;    
      
        
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (grid2[i][j] == 1 && isSubIsland(i, j, rows, cols, grid1, grid2)) {
                    subIslandsCount++; 
                }
            }
        }
        return subIslandsCount; 
    }

    
    private boolean isSubIsland(int row, int col, int rows, int cols, int[][] grid1, int[][] grid2) {
        boolean isSub = grid1[row][col] == 1;
        grid2[row][col] = 0; 
        int[] dirRow = {-1, 0, 1, 0};
        int[] dirCol = {0, 1, 0, -1};
        for (int k = 0; k < 4; ++k) {
            int newRow = row + dirRow[k];
            int newCol = col + dirCol[k];
            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid2[newRow][newCol] == 1
                && !isSubIsland(newRow, newCol, rows, cols, grid1, grid2)) {
                isSub = false;
            }
        }
        return isSub; 
    }
}