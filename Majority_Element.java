// Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        int maj=0;
        int count=0;
        for(int i=0;i<=nums.length-1;i++){
            if(count==0){
            maj=nums[i];
            count++;
            
            }
            else if(nums[i]==maj){
                count++;
            }
            else{
                count--;
            }
        }
        return maj;

    }
}