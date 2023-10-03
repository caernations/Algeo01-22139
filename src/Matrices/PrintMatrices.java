package Matrices;

public class PrintMatrices {
    public static void Print(double[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%.2f", matrix[i][j] + 0);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static double[][] CreateHilbert(int n) {
	    double[][] hasil = new double[n][n];
	    for (int i = 1; i <= n; i++) {
		    for (int j = 0; j < n; j++) {
			    hasil[i-1][j] = (float)1 / (i + j);
		    }
	    }

	    return hasil;
    }
}
