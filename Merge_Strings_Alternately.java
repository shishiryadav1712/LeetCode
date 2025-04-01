// Merge Strings Alternately
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len_1 = word1.length();
        int len_2 = word2.length();
        StringBuilder f = new StringBuilder(); 

        int i = 0; 
        while (i < len_1 || i < len_2) { 
            if (i < len_1) {
                f.append(word1.charAt(i)); 
            }
            if (i < len_2) {
                f.append(word2.charAt(i)); 
            }
            i++;
        }

        return f.toString();
    }
}
