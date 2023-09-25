package Matrices;

public class Transpose {
    public static double[][] TransposeMatrix(double[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        double[][] trans = new double[col][row];

        for (int i=0; i<col; i++) {
            for (int j=0; j<row; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }
}
