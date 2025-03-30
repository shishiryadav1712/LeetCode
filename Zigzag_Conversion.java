// Zigzag Conversion
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows){
            return s;
        }

        StringBuilder [] bob=new StringBuilder[numRows];
        for(int i =0;i<numRows;i++){
            bob[i]=new StringBuilder();
        }
        int currentRow=0;
        boolean goingDown=false;
        for(char c:s.toCharArray()){
            bob[currentRow].append(c);
            if(currentRow==0 || currentRow==numRows-1){
                goingDown=!goingDown;
            }

            if(goingDown==true){
                currentRow++;
            }
            else{
                currentRow--;
            }
            
 
        }
        StringBuilder result=new StringBuilder();
        for(StringBuilder row:bob){
            result.append(row);
        }
        return result.toString();

        }
        
        
    }
