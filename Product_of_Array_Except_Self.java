// Product of Array Except Self
class Solution {
    public int[] productExceptSelf(int[] nums) {
    final int n=nums.length;
    int []right=new int[n];
    int []left=new int[n];

    left[0]=1;
    right[n-1]=1;

    for(int i=1;i<n;++i){
        left[i]=left[i-1]*nums[i-1];
    }

    for(int i=n-2;i>=0;--i){
        right[i]=right[i+1]*nums[i+1];

    }

    for(int j=0; j<n;j++){

        nums[j]=left[j]*right[j];
    }

    return nums;
    
        
    }
}