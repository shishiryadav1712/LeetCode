// Reverse String
class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        int mid=start+((end-start)/2);
         while(start<=mid){
            char temp=s[end];
            s[end]=s[start];
            s[start]=temp;
            start=start+1;
            end=end-1;

        }
       
        
    }
    
}