// Valid Perfect Square
class Solution {
    public boolean isPerfectSquare(int num) {
        //Brute force with Binary search approach 
        int start=0;
        int end=num;
        int mid =0;

        while(start<=end){
            mid=start+(end-start)/2;
            long target=(long)mid*mid;
            if(target==num){
                return true;
            }
            else if(target<num){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
                return false;
    }
}