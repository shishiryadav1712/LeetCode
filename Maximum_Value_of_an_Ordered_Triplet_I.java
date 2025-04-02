// Maximum Value of an Ordered Triplet I
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max = 0;

        for (int j = 1; j < n - 1; j++) {
            int maxLeft = 0;
            for (int i = 0; i < j; i++) {
                maxLeft = Math.max(maxLeft, nums[i]);
            }

            int maxRight = 0;
            for (int k = j + 1; k < n; k++) {
                maxRight = Math.max(maxRight, nums[k]);
            }

            long val = (long)(maxLeft - nums[j]) * maxRight;
            if (val > max) {
                max = val;
            }
        }

        return max;
    }
}