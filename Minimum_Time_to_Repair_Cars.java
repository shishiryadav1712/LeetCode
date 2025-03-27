// Minimum Time to Repair Cars
class Solution {
    public long repairCars(int[] ranks, int cars) {
    long low=0;
    long high=1L * ranks[0]*cars*cars;
    while(low<high){
        long mid=low+(high-low)/2;
        long count=0;
        for(int r:ranks){
            count=count + (long) Math.sqrt(mid/r);
        }
         if (count >= cars) {
                high = mid;
            } else {
                low=mid+1;
            }

    }
    
        return low;
    }
}