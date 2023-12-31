package Matrices;

public class Inverse {

    public static double[][] Adjoin(double[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Matriks harus memiliki jumlah baris & kolom yang sama untuk mencari adjoin.");
        }

        int row = matrix.length;
        int col = matrix[0].length;

        double[][] adj = new double[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                adj[i][j] = Cofactor.SingleCofactor(matrix, i, j);
            }
        }

        adj = Transpose.TransposeMatrix(adj);
        return adj;
    }
    public static double[][] Cofactor(double[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Matriks harus memiliki jumlah baris & kolom yang sama untuk mencari inverse.");
        }

        if (Determinant.CofactorExp(matrix) == 0) {
            System.out.println("Matriks dengan determinan 0 tidak memiliki invers");
            return matrix;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        double[][] temp = Adjoin(matrix);
        double[][] inv = new double[row][col];

        for (int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                inv[i][j] = (1 / Determinant.CofactorExp(matrix)) * temp[i][j];
            }
        }
        return inv;
    }

    public static double[][] OBE(double[][] matriks)
    {
        int m = matriks.length;
        int n = matriks[0].length;

        // pembuatan matriks identitas
        double[][] identity = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    identity[i][j] = 1;                
                }
                else {
                    identity[i][j] = 0;
                }
            }
        }

        // penggabungan matriks masukan dengan identitas
        double[][] temp = new double[m][2 * n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = matriks[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j + n] = identity[i][j];
            }
        }

        // perhitungan invers
        temp = Echelon.ReducedRowEchelon(temp);

        double[][] hasil = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = temp[i][j + n];
            }
        }

        return hasil;
    }

}
