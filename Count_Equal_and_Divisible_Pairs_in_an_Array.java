// Count Equal and Divisible Pairs in an Array
class Solution {
    public int countPairs(int[] nums, int k) {
        int count=0;
        int start=0;
        while(start<nums.length-1){
        for(int i=start+1; i<nums.length; i++){

            if(nums[start]==nums[i] && (start*i)%k==0){
                count++;
            }
        }
        start++;
       
        }
        return count;

        
    }
}