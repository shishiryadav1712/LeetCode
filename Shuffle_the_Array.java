// Shuffle the Array
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int pos=0;
        int [] temp= new int[2*n];
      
        for(int i =0 ; i<=n-1;i++){
            temp[pos]=nums[i];
            pos++;
            temp[pos]=nums[n+i];
            pos++;
            }
            
            return temp;
        }
        
        
    }
