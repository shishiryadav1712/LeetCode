// Power of Four
class Solution {
    public boolean isPowerOfFour(int n) {
        return helper(n);
    }

    static boolean helper(int num) {
        if (num == 1) return true;
        if (num == 0 || num % 4 != 0) return false;
        return helper(num / 4);
    }
}
