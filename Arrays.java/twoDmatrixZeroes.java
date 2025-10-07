public class twoDmatrixZeroes {
    public static void setZeroes(int[][] matrix) {
         int row = matrix.length;          // number of rows
         int col = matrix[0].length;       // number of columns (assuming non-empty)

     for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            if(matrix[i][j]==0){
                for(int k=0;k<col;k++){
                    if (matrix[i][k] != 0) {
                      matrix[i][k] = -1; // mark
                    }
                }
                for(int k=0;k<row;k++){
                    if (matrix[k][j] != 0) {
                         matrix[k][j] = -1; // mark
                    }
                }
            }
        }
     }
        // Step 2: Convert all -1 markers to 0
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

      System.out.println("Processed Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

   }
    public static void main(String[] args) {
        int[][] array ={
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };
    setZeroes(array);
}
}