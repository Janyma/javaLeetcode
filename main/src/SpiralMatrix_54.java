import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();

        int top=0;
        int left=0;
        int right= matrix[0].length-1;
        int bottom=matrix.length-1;

        while(true){
            //from top left to top right
            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);


            }
            top++;
            if(top>bottom){
                break;

            }

            //from top right to right bottom
            for(int i=top; i<=bottom; i++){
                res.add(matrix[i][right]);


            }
            right--;
            if(left>right){
                break;

            }
            //from right bottom to left bottom
            for(int i=right; i>=left; i--){
                res.add(matrix[bottom][i]);


            }
            bottom--;

            if(top>bottom){
                break;

            }
            //from left bottom to left top
            for(int i=bottom; i>=top; i--){
                res.add(matrix[i][left]);


            }
            left++;
            if(left>right){
                break;

            }



        }
        return res;


    }
}
