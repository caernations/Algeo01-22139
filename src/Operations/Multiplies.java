package Operations;

public class Multiplies {
    public static double[][] MultiplyMatrix(double[][] matrix1, double[][] matrix2) {
        int m = matrix1.length;
        int n = matrix1[0].length;
        int p = matrix2[0].length;
    
        if (n != matrix2.length) {
            throw new IllegalArgumentException("Jumlah kolom matriks pertama harus sama dengan jumlah baris matriks kedua untuk perkalian matriks.");
        }
    
        double[][] result = new double[m][p];
    
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                double temp = 0;
                for (int k = 0; k < n; k++) { // Menggunakan 'n' untuk perulangan ketiga
                    temp += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = temp;
            }
        }
    
        return result; 
    }

    public static double[][] MultiplyMatrixByConstant(double[][] matrix, double constant) {
        int m = matrix.length;
        int n = matrix[0].length;

        double[][] result = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[i][j] * constant;
            }
        }

        return result;
    }

    public static double[][] MultiplyMatrixWithMod(double[][] matrix1, double[][] matrix2, double mod) {
        int m = matrix1.length;
        int n = matrix1[0].length;
        int p = matrix2[0].length;

        if (n != matrix2.length) {
            throw new IllegalArgumentException("Jumlah kolom matriks pertama harus sama dengan jumlah baris matriks kedua untuk perkalian matriks.");
        }

        double[][] result = new double[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                double temp = 0;
                for (int k = 0; k < p; k++) {
                    temp += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = temp % mod;
            }
        }

        return result;
    }
}
