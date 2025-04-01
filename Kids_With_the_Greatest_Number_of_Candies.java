// Kids With the Greatest Number of Candies
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        int n=candies.length;
        List<Boolean> result=new ArrayList<>() ;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        for(int j=0; j<n;j++){
            result.add(candies[j]+extraCandies>=max);
           
        }

        return result;
    }
}