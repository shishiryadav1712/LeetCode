// Maximum Candies Allocated to K Children
class Solution {
    public int maximumCandies(int[] candies, long k) {
  int left = 1, right = 0;
        for (int c : candies) {
            right = Math.max(right, c);
        }
        
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (canAllocate(candies, k, mid)) {
                result = mid; 
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    private boolean canAllocate(int[] candies, long k, int size) {
        long count = 0;
        for (int c : candies) {
            count += c / size; 
        }
        return count >= k;
    }
}