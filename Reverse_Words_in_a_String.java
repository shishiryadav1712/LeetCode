// Reverse Words in a String
class Solution {
    public String reverseWords(String s) {

        StringBuilder result=new StringBuilder();
        String [] parts=s.split("\\s+");
        for(int i=parts.length-1; i>=0;i--){
            result.append(parts[i]);
            if(i>0)result.append(" ");
        }

        return result.toString().trim();

        
    }
}