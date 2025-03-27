// Divide Array Into Equal Pairs
class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        
       
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        
        for (int count : frequency.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    

}
