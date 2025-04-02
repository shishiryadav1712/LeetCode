// Determine if Two Strings Are Close
import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> check1 = new HashMap<>();
        Map<Character, Integer> check2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            check1.put(c, check1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            check2.put(c, check2.getOrDefault(c, 0) + 1);
        }

        
        if (!check1.keySet().equals(check2.keySet())) return false;

     
        List<Integer> freq1 = new ArrayList<>(check1.values());
        List<Integer> freq2 = new ArrayList<>(check2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
    }
}
