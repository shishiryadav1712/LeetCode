// Regular Expression Matching
class Solution {
    public boolean isMatch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
      
        
        boolean[][] dp = new boolean[textLength + 1][patternLength + 1];
      
        dp[0][0] = true;
      
        for (int i = 0; i <= textLength; i++) {
            for (int j = 1; j <= patternLength; j++) {
              
                
                if (pattern.charAt(j - 1) == '*') {
                    
                    dp[i][j] = dp[i][j - 2];
                    
                    if (i > 0 && (pattern.charAt(j - 2) == '.' || pattern.charAt(j - 2) == text.charAt(i - 1))) {
                        
                        dp[i][j] |= dp[i - 1][j];
                    }
                } else {
                    
                    if (i > 0 && (pattern.charAt(j - 1) == '.' || pattern.charAt(j - 1) == text.charAt(i - 1))) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }
            }
        }
      

        return dp[textLength][patternLength];
    }
}