public class OneDArrayTotwoDArray_2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {

       // int[][] a={};
       // int c=0;
        if((m*n) !=original.length ){
            System.out.println(original.length);
            return new int[0][0];
        }else{
            int[][] newArray= new int[m][n];

           // for(int i=0; i<m;i++){
              //  for(int j=0;j<n;j++){
                  //  newArray[i][j]=original[c];
                  //  c++;
               // }
           // }
            //return newArray;

            //new approach

            for (int i=0; i<original.length;i++){
                newArray[i/n][i%n]=original[i];
            }
            return newArray;


        }
    }
}
