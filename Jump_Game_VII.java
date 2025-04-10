// Jump Game VII
class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {

        int n=s.length();
        if(s.charAt(n-1)!='0'){
            return false;
        }

        boolean [] reachable=new boolean[n];
        reachable[0]=true;
        int farthest=0;

        for(int i=0;i<n;i++){
            if(!reachable[i]) continue;

            int start=Math.max(i+minJump, farthest+1);
            int end=Math.min(i+maxJump, n-1);


            for(int j=start;j<=end; j++){
                if(s.charAt(j)=='0'){
                    reachable[j]=true;
                }
            }
            farthest=Math.max(farthest, i+maxJump);
        }

        return reachable[n-1];
        
    }
}