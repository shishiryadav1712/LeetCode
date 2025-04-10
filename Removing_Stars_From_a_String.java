// Removing Stars From a String
class Solution {
    public String removeStars(String s) {
        Stack<Character>build=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(!build.isEmpty()){
                    build.pop();

                }
            }
                else{
                    build.push(s.charAt(i));
                }
            
        }

        StringBuilder res=new StringBuilder();
        for(char c :build){
            res.append(c);
        }
        return res.toString();
    }
}