package Matrices;
import java.util.Scanner;

public class ReadMatrices {
    public static double[][] Keyboard() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran n (misalnya 3 untuk matriks 3x3): ");
        int n = scanner.nextInt();
        
        double[][] matrix = new double[n][n];

        System.out.println("Masukkan matriks berukuran " + n + "x" + n + " dengan elemen-elemen dipisahkan oleh spasi dan baris-baris dipisahkan oleh newline:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (scanner.hasNextDouble()) {
                    matrix[i][j] = scanner.nextDouble();
                }
            }
        }
        scanner.close();
        return matrix;
    }
}
