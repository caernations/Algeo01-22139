package Matrices;
import static Matrices.Determinant.CalcDeterminant;
import static Matrices.Cofactor.SingleCofactor;
import static Matrices.Transpose.TransposeMatrix;

public class Inverse {

    public static double[][] Adjoin(double[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Matriks harus memiliki jumlah baris & kolom yang sama untuk mencari adjoint.");
        }

        int row = matrix.length;
        int col = matrix[0].length;

        double[][] adj = new double[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                adj[i][j] = SingleCofactor(matrix, i, j);
            }
        }

        adj = TransposeMatrix(adj);
        return adj;
    }
    public static double[][] InverseMatrix(double[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Matriks harus memiliki jumlah baris & kolom yang sama untuk mencari inverse.");
        }

        if (CalcDeterminant(matrix) == 0) {
            System.out.println("Matriks dengan determinan 0 tidak memiliki invers");
            return matrix;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        double[][] temp = Adjoin(matrix);
        double[][] inv = new double[row][col];

        for (int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                inv[i][j] = (1 / CalcDeterminant(matrix)) * temp[i][j];
            }
        }
        return inv;
    }
}