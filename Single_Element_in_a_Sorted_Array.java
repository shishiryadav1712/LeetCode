// Single Element in a Sorted Array
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid =0;
        while(start<end){
            mid=start+(end-start)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                start=mid+2;
            }
            else{
                end=mid;
            }
            
        }
        return nums[start];
    }
}