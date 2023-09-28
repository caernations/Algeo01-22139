package Matrices;

public class Cofactor {
    public static double SingleCofactor(double[][] matriks, int baris, int kolom) {
        int m = matriks.length;
        int n = matriks[0].length;

        if (n != m) {
            System.out.println("Matriks kofaktor hanya dapat dibuat dari matriks persegi.");
            return 0;
        }

        double[][] minor = new double[n - 1][n - 1];
        int minorBaris = 0;
        for (int i = 0; i < n; i++) {
            int minorKolom = 0;            
            if (i == baris) continue;
            for (int j = 0; j < n; j++) {
                if (j == kolom) continue;
                minor[minorBaris][minorKolom] = matriks[i][j];
                minorKolom++;
//                System.out.println("nilai i adalah" + i);
//                System.out.println("nilai j adalah" + j);
//                System.out.println("nilai minorBaris adalah" + minorBaris);
//                System.out.println("nilai minorKolom adalah" + minorKolom);
            }
            minorBaris++;
        }
		return Math.pow(-1, baris + kolom) * Determinant.CalcDeterminant(minor);
	}

    public static double[][] MatricesCofactor(double[][] matriks) {
        int m = matriks.length;
        double[][] result = new double[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = SingleCofactor(matriks, i, j);
            }
        }
        return result;
    }
}
