// Jump Game II
class Solution {
    public int jump(int[] nums) {
        int steps=0;
        int max=0;
        int lastmax=0;
        for(int i=0 ; i<nums.length-1; ++i){
            max=Math.max(max,i+nums[i]);
            if(lastmax==i){
                steps++;
                lastmax=max;
                if(max>=nums.length-1){
                    break;
                }
            }

        }
        return steps;
        
    }
}