// Reverse Vowels of a String
class Solution {
    public String reverseVowels(String s) {
        char[] rev = s.toCharArray();
        int left = 0, right = rev.length - 1;

        while (left < right) {
            while (left < right && !isVowel(rev[left])) left++;
            while (left < right && !isVowel(rev[right])) right--;

            // Swap the vowels
            char temp = rev[left];
            rev[left] = rev[right];
            rev[right] = temp;

            left++;
            right--;
        }

        return new String(rev);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
