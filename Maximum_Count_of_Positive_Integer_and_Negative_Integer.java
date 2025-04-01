// Maximum Count of Positive Integer and Negative Integer
class Solution {
    public int maximumCount(int[] nums) {
        int countpos=0;
        int countneg=0;
        for(int i=0; i<=nums.length-1; i++){
           if(nums[i]>0){
                countpos++;
            }
            else if(nums[i]<0){
                countneg++;
            }
            }
            return Math.max(countpos, countneg);
        }

        
    }