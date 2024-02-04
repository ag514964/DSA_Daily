import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    
    public static void main(String[] args){
        int numRows = 5;

        System.out.println(generate(numRows));

    }
    public static List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> PascalList = new ArrayList<>(numRows);
        if(numRows == 0)
        return PascalList;

        List<Integer> Row1 = new ArrayList<>(1);
        Row1.add(1);
        PascalList.add(Row1);
    


        for(int i =1; i<numRows; i++)
        {
            List<Integer> PascalRow = new ArrayList<>(i+1);
            
            for(int j=0; j<= i; j++)
            {
                if(j==0){
                    PascalRow.add((PascalList.get(i-1)).get(j));

                }
                else if(j==i){
                    PascalRow.add((PascalList.get(i-1)).get(j-1));

                }
                else{
                     PascalRow.add((PascalList.get(i-1)).get(j-1)+(PascalList.get(i-1)).get(j));

                }


            }
            PascalList.add(PascalRow);
        }
        return PascalList;

    }
}
