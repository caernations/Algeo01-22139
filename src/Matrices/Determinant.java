package Matrices;

public class Determinant {
    public static double CofactorExp(double[][] matriks) {
        int m = matriks.length;
        int n = matriks[0].length;

        if (n != m) {
            System.out.println("Fungsi determinan hanya dapat diaplikasikan ke matriks persegi.");
            return 0;
        }

        if (m == 1) {
            return matriks[0][0];
        }
        if (m == 2) {
            return matriks[0][0] * matriks[1][1] - matriks[0][1] * matriks[1][0];
        }

        double determinan = 0;
        for (int i = 0; i < m; i++) {
            determinan += matriks[0][i] * Cofactor.SingleCofactor(matriks, 0, i);
        }
        return determinan;
    }
    public static double RowReduction(double[][] matriks) {
        int m = matriks.length;
        int n = matriks[0].length;

        if (n != m) {
            System.out.println("Fungsi determinan hanya dapat diaplikasikan ke matriks persegi.");
            return 0;
        }

        int a = 0;
        double determinan = matriks[0][0];
        matriks = Echelon.RowEchelon(matriks, a);

        for (int i = 1; i < m; i++) {
            determinan *= matriks[i][i];
        }

        determinan *= Math.pow(1, a);

        return determinan;
    }
}
