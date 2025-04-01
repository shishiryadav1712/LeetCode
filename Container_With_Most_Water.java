// Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxarea = 0;

        while (left < right) {
            int minHeight;

            if (height[left] < height[right]) {
                minHeight = height[left];
                maxarea = Math.max(maxarea, (right - left) * minHeight);
                left++;
            } else {
                minHeight = height[right];
                maxarea = Math.max(maxarea, (right - left) * minHeight);
                right--;
            }
        }

        return maxarea;
    }
}
