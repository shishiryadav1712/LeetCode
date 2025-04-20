// Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
            while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;

            }



            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }

        
    }
    private void swap(int nums[], int num1, int num2){
        int temp=0;
        temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
}