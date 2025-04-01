// Number of Ways to Split a String
class Solution {
    public int numWays(String s) {
        int mod=1_000_000_007;
        int totalones=0;

        for(char c:s.toCharArray()){
            if(c=='1') totalones++;

        }

        if(totalones % 3 !=0) return 0;

        if (totalones==0){
            long st=s.length()-1;
            return (int) ((st*(st-1)/2)%mod);

        }

        int onepp=totalones/3;
        long break1=0;
        long break2=0;
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
            if(count==onepp) break1++;
            else if(count==2*onepp) break2++;
        }

        return (int)((break1*break2)%mod);


        
    }
}