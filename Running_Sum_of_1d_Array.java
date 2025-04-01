// Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=0;i<=nums.length-1;i++){
            if(i!=0){
                nums[i]=nums[i-1]+nums[i];
                 }

            
        }
       return nums; 
    }

}