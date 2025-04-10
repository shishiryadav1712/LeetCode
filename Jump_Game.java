// Jump Game
class Solution {
    public boolean canJump(int[] nums) {
       int maxReach=0;
       int len=nums.length;
       for(int i=0; maxReach>=i &&  i<len;i++){
        maxReach=Math.max(maxReach,i+nums[i]);
        if(maxReach>=len-1) return true;
       } 
       return false;
      
    }
}