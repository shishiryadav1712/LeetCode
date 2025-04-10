// Valid Parentheses
class Solution {
    public boolean isValid(String s) {
         Stack<Character> lul=new Stack<>( );
         for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                lul.push(c);
            }
            else{
                if(lul.isEmpty()) return false;

                char top=lul.pop();
                if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='[')){
                    return false;
                }
            }
         }
         return lul.isEmpty();
        
    }
}