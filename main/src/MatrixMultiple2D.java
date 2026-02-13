import java.util.ArrayList;

public class MatrixMultiple2D {
    public static int[][] maxtrixMultiple(int[][] a, int[][] b){
        int len_a_row= a.length;
        int len_a_column=a[0].length;
        if(len_a_column!=b.length){
            return new int[0][];
        }
        int[][] result = new int [len_a_row][b[0].length];
        for(int i=0; i<a.length; i++){
            for (int j=0; j<b[0].length;j++){
                for(int k=0; k<len_a_column;k++){
                    int d=a[i][k]*b[k][j];
                    result[i][j]= result[i][j]+d;
                }

            }
        }
        return result;

    }
}
