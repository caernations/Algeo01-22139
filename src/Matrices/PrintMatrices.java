package Matrices;
import java.util.Scanner;

public class PrintMatrices {
    public static void print(double[][] matrix) {
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