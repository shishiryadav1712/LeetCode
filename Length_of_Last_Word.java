// Length of Last Word
class Solution {
    public int lengthOfLastWord(String s) {
        
      //  String [] sharp=s.split("\\s+");
        //return sharp[sharp.length-1].length();

        int length=0;
        int loc=s.length()-1;
        while(loc>=0 && s.charAt(loc)==' '){
            loc--;
        }
        while(loc>=0 && s.charAt(loc)!=' '){
            length++;
            loc--;
        }
        return length;
    }
}