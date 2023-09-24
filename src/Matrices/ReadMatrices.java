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
                if (scanner.hasNext()) {
                    String token = scanner.next();
                    try {
                        matrix[i][j] = Double.parseDouble(token);
                    } catch (NumberFormatException e) {
                        System.err.println("Input is not a valid double: " + token);
                        return null;
                    }
                }
            }
        }
        scanner.close();
        return matrix;
    }
}
