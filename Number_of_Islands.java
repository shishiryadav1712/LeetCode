// Number of Islands
class Solution {
  public int numIslands(char[][] grid) {
     int res = 0;
     int m = grid.length, n = grid[0].length;
    
     for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
             if (grid[i][j] == '1') {
                 
                 res++;
               
                 dfsalg(grid, i, j);
             }
         }
     }
     return res;
}

static void dfsalg(char[][] grid, int i, int j) {
     int m = grid.length, n = grid[0].length;
     if (i < 0 || j < 0 || i >= m || j >= n) {
         return;
     }
     if (grid[i][j] == '0') {
         return;
     }
     grid[i][j] = '0';
     dfsalg(grid, i + 1, j);
     dfsalg(grid, i, j + 1);
     dfsalg(grid, i - 1, j);
     dfsalg(grid, i, j - 1);
}}