// Split Two Strings to Make Palindrome
class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return can(a,b)||can(b,a);
    }


        private boolean can(String a, String b){
            int left=0;
            int right=a.length()-1;

            while(left< right && a.charAt(left)== b.charAt(right)){
                left++;
                right--;

            }

            return isPalindrome(a, left, right) || isPalindrome(b,left,right);
        }
        private boolean isPalindrome(String s, int left , int right){
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        
    
}