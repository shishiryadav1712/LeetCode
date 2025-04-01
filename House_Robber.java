// House Robber
class Solution {
    public int rob(int[] nums) {
        int norob=0;
        int rob=0;
        for(int i:nums){
            int temp=Math.max(norob,rob);
            rob=norob+i;
            norob=temp;
        }
        return Math.max(norob,rob);

        }

        
    }
