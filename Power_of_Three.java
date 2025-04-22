// Power of Three
class Solution {
    public boolean isPowerOfThree(int n) {
        return pow(n);
        
    }

    static boolean pow(int num){
        if(num==1) return true;
        if(num==0 || num%3 !=0) return false;
        return pow(num/3);
    }
}