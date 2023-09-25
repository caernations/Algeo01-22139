package Matrices;

public class PrintMatrices {
    public static void Print(double[][] matrix) {
        int n = matrix.length;

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}