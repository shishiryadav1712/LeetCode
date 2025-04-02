// Max Number of K-Sum Pairs
class Solution {
    public int maxOperations(int[] nums, int k) {

       HashMap<Integer,Integer>map=new HashMap<>();
       int count=0;
       for(int i=0;i<nums.length;i++){
        int check=k-nums[i];
        if(map.getOrDefault(check,0)>0){
            count++;
            map.put(check,map.get(check)-1);
        }
        else{
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       }
             return count;   
            }

         }
    