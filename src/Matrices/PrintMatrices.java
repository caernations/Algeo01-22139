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
}
