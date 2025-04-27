// Equal Row and Column Pairs
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        
        // Step 1: Store all rows
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(",");
            }
            rowMap.put(sb.toString(), rowMap.getOrDefault(sb.toString(), 0) + 1);
        }
        
        int count = 0;
        
        // Step 2: Check all columns
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(",");
            }
            count += rowMap.getOrDefault(sb.toString(), 0);
        }
        
        return count;
    }
}
