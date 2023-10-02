package Functions;
import java.util.Scanner;

public class Regression {
    public static void AppendRegresi(double[][] result, double[][] B, double sumY, int persrow, int n) {
        //Masukkan persamaan regresi (satu baris) ke matrix result
        for (int i = 0; i < n; i++) {
            result[persrow][i] = B[i][0];
        }
        result[persrow][n] = sumY;
    }
    public static void RegresiMatrix(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        double[][] result = new double[n][n+1];
        double[][] X = new double[m][n + 1];

        //peroleh matrix X (kolom Y diubah jadi angka 1 semua)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    X[i][j] = 1;
                } else {
                    X[i][j] = matrix[i][j];
                }
            }
        }

        //peroleh persamaan
        for (int persrow = 0; persrow < n; persrow++) {
            double[][] B = new double[n][1];
            double sumY = 0;

            if (persrow == 0) {
                B[0][0] = m;
                for (int p = 0; p < m; p++) {
                    for (int q = 1; q < n; q++) {
                        B[q][0] += X[p][q];
                    }
                    sumY += matrix[p][0];;
                }
                AppendRegresi(result, B, sumY, persrow, n);
            } else {
                for (int i = 0; i < m; i++) {
                    B[0][0] += X[i][persrow];
                    sumY += matrix[i][0] * X[i][persrow];
                }
                for (int p = 0; p < m; p++) {
                    for (int q = 1; q < n; q++) {
                        B[q][0] += X[p][persrow] * X[p][q];
                    }
                }
                AppendRegresi(result, B, sumY, persrow, n);
            }
        }

        //menyelesaikan matrix result dengan eliminasi Gauss-Jordan dan store data di array solutions
        double[] solutions = new double[n];
        SPL.GaussJordan(result, solutions);

        //print solutions
        System.out.print("f(x) = " + solutions[0]);
        for (int i = 1; i < n; i++) {
            if (solutions[i] < 0) {
                System.out.print(" - ");
            } else {
                System.out.print(" + ");
            }
            System.out.print(Math.abs(solutions[i]) + "x" + i);
        }
        System.out.println("\r");

        //input dan output estimasi nilai. OPSIONAL
        Scanner scanner = new Scanner(System.in);
        double est = solutions[0]; //estimated

        System.out.print("Apakah ingin mengestimasi nilai (Y/N)? ");
        String choice = scanner.nextLine().toUpperCase();

        switch (choice) {
            case "Y":
                for (int i = 1; i < n; i++) {
                    System.out.print("Masukkan X" + i + " = ");
                    est += (scanner.nextDouble() * solutions[i]);
                }
                System.out.println("f(xk) = " + est);
                break;

            case "N" :
                break;
        }
    }
}
