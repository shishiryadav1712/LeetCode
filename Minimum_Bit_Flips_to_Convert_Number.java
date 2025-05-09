// Minimum Bit Flips to Convert Number
class Solution {
    public int minBitFlips(int start, int goal) {
        int t = start ^ goal;
        int ans = 0;
        while (t != 0) {
            ans += t & 1;
            t >>= 1;
        }
        return ans;
    }
}