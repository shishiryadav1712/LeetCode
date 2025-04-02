// Unique Number of Occurrences
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> occ=new HashMap<>();

    
    
    for(int i:arr){
        occ.put(i,occ.getOrDefault(i,0)+1);
        
    }


    Set<Integer>result=new HashSet<>();
    for(int j:occ.values()){
    if(!result.add(j)){

        return false;

    }
    }
    return true;


    


    
    }
    
}