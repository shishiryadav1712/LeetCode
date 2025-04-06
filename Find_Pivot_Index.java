// Find Pivot Index
class Solution {
    public int pivotIndex(int[] nums) {
        int sumleft=0;
        int sumright=0;
        int arraysum=0;
        for(int i=0; i<nums.length;i++){
            arraysum=arraysum+nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            sumright=arraysum-sumleft-nums[i];

            if(sumleft==sumright) return i;
            sumleft=sumleft+nums[i];
        }
        return -1;
    }
}