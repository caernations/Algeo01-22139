package Functions;
import Matrices.*;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Regression {
    public static void AppendRegresi(double[][] result, double[][] B, double sumY, int persrow, int n) {
        //Print persamaan regresi (satu baris)
        DecimalFormat df = new DecimalFormat("#.####");
        for (int i = 0; i < n; i++) {
            result[persrow][i] = B[i][0];
        }
        result[persrow][n] = sumY;
    }

    public static void PrintRegresi(double[][] B, double sumY, int persrow, int n) {
        //Print persamaan regresi (satu baris)
        DecimalFormat df = new DecimalFormat("#.####");
        for (int i = 0; i < n + 1; i++) {
            if (i == 0) {
                System.out.print(df.format(B[0][0]) + "b0");
            } else {
                System.out.print(" + " + df.format(B[i][0]) + "b" + i);
            }
        }
        System.out.println(" = " + df.format(sumY));
    }
    public static void RegresiMatrix() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan jumlah peubah x (n): ");
        int n = scanner.nextInt();
        System.out.print("Masukkan jumlah sampel (m): ");
        int m = scanner.nextInt();

        double[][] matrix = new double[m][n + 1];
        double[][] result = new double[n+1][n+1];
        double[][] X = new double[m][n + 1];
        double[][] Y = new double[m][1];

        System.out.println("Masukkan elemen-elemen matriks (pisahkan dengan spasi dan newline setelah setiap baris):");
        //batasnya n+1 karena untuk kolom nilai Yi (berdasarkan studi kasus kolom Y ada di paling kiri)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n + 1; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        //peroleh matrix X (kolom Y diubah jadi angka 1 semua)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (j == 0) {
                    X[i][j] = 1;
                } else {
                    X[i][j] = matrix[i][j];
                }
            }
        }

        //peroleh matrix Y (kolom pertama dari matrix input)
        for (int i = 0; i < m; i++) {
            Y[i][0] = matrix[i][0];
        }

        //peroleh persamaan
        for (int persrow = 0; persrow < n + 1; persrow++) {
            double[][] B = new double[n + 1][1];
            double sumY = 0;

            if (persrow == 0) {
                B[0][0] = m;
                for (int p = 0; p < m; p++) {
                    for (int q = 1; q < n + 1; q++) {
                        B[q][0] += X[p][q];
                    }
                    sumY += Y[p][0];
                }
                AppendRegresi(result, B, sumY, persrow, n);
                PrintRegresi(B, sumY, persrow, n);
            } else {
                for (int i = 0; i < m; i++) {
                    B[0][0] += X[i][persrow];
                    sumY += Y[i][0] * X[i][persrow];
                }
                for (int p = 0; p < m; p++) {
                    for (int q = 1; q < n + 1; q++) {
                        B[q][0] += X[p][persrow] * X[p][q];
                    }
                }
                AppendRegresi(result, B, sumY, persrow, n);
                PrintRegresi(B, sumY, persrow, n);
            }
        }

        //Print Result
        PrintMatrices.Print(result);
        SPL.Gauss(result);
    }
}
