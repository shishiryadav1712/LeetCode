// Find the Highest Altitude
class Solution {
    public int largestAltitude(int[] gain) {

        int res=0;
        int []rt=new int [gain.length+1];
            rt[0]=0;
        for(int i=0;i<gain.length;i++){
            rt[i+1]=rt[i]+gain[i];
            res=Math.max(res,rt[i+1]);
        }
            return res;
        
    }
}