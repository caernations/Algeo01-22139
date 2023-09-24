package Matrices;
import java.util.Scanner;

public class ReadMatrices {
    public static double[][] Keyboard() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris (m): ");
        int m = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom (n): ");
        int n = scanner.nextInt();

        double[][] matrix = new double[m][n];

        System.out.println("Masukkan elemen-elemen matriks (pisahkan dengan spasi dan newline setelah setiap baris):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }
}
