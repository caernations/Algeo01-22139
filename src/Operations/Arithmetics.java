package Operations;



public class Arithmetics {
    public static double[][] Addition(double[][] matrix1, double[][] matrix2) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;

        if (matrix2.length != baris || matrix2[0].length != kolom) {
            throw new IllegalArgumentException("Matriks harus memiliki jumlah baris & kolom yang sama untuk penjumlahan.");
        }

        double[][] result = new double[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }


    public static double[][] Subtraction(double[][] matrix1, double[][] matrix2) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;

        if (matrix2.length != baris || matrix2[0].length != kolom) {
            throw new IllegalArgumentException("Matriks harus memiliki jumlah baris dan kolom yang sama untuk pengurangan.");
        }

        double[][] result = new double[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }


    public static double Trace(double[][] matrix){
        int baris = matrix.length;
        int kolom = matrix[0].length;

        if (baris != kolom) {
            throw new IllegalArgumentException("Matriks harus menjadi matriks persegi untuk menghitung jejak.");
        }

        double trace = 0.0;

        for (int i = 0; i < baris; i++) {
            trace += matrix[i][i];
        }

        return trace;
    }
}