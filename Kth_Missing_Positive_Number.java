// Kth Missing Positive Number
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0, currentNumber = 1, index = 0;

        while (missingCount < k) {
            if (index < arr.length && arr[index] == currentNumber) {
               
                index++;
            } else {
                
                missingCount++;
                if (missingCount == k) {
                    return currentNumber; 
                }
            }
            currentNumber++;
        }

        
        return currentNumber + (k - missingCount - 1);
    }
}
