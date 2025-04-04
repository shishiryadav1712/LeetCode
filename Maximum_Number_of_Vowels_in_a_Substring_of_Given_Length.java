// Maximum Number of Vowels in a Substring of Given Length
class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int i=0;i<k;i++){

            if(isVowel(s.charAt(i))) count++;


        }
        max=count;
        for(int j=k;j<=s.length()-1;j++){
            if(isVowel(s.charAt(j-k))) count--;
            if(isVowel(s.charAt(j))) count++;
            max=Math.max(max,count);

            if(max==k) return k;
        }
        
        
        return max;
        
        
    }


    private boolean isVowel(char c){
            return "aeiou".indexOf(c)>=0 ;
        }

}