package Matrices;
import java.util.Scanner;

public class ReadMatrices {
    public static double[][] Keyboard() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(">> Jumlah baris\t: ");
        int m = scanner.nextInt();
        System.out.print(">> Jumlah kolom\t: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[m][n];
        System.out.println("""

            Elemen-elemen matriks
            ──────────────────────""");
        System.out.println("> Gunakan spasi untuk pemisah antarkolom");
        System.out.println("> Gunakan newline (enter) untuk pemisah antarbaris\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }
}
