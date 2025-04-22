// Power of Two
class Solution {
    public boolean isPowerOfTwo(int n) {
        return pow(n);
        
    }

    static boolean pow(int num){
        if(num==1) return true;
        if(num==0 || num%2 !=0) return false;
        return pow(num/2);
    }
}
        
  