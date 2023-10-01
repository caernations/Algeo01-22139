package Functions;
import Matrices.*;
import Operations.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Regression {
    public static void RegresiMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah peubah x (n): ");
        int n = scanner.nextInt();
        System.out.print("Masukkan jumlah sampel (m): ");
        int m = scanner.nextInt();

        double[][] matrix = new double[m][n+1];
        double[][] X = new double[m][n+1];
        double[][] Y = new double[m][1];
        double[][] B = new double[n+1][1];
        double[][] XtX_Inv = new double[n+1][n+1];
        double[][] XtY = new double[n+1][1];

        System.out.println("Masukkan elemen-elemen matriks (pisahkan dengan spasi dan newline setelah setiap baris):");
        //batasnya n+1 karena untuk kolom nilai Yi (berdasarkan studi kasus kolom Y ada di paling kiri)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n+1; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        //peroleh matrix X (kolom Y diubah jadi angka 1 semua)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n+1; j++) {
                if (j == 0) {
                    X[i][j] = 1;
                }
                else {
                    X[i][j] = matrix[i][j];
                }
            }
        }

        //peroleh matrix Y (kolom pertama dari matrix input)
        for (int i = 0; i < m; i++) {
            Y[i][0] = matrix[i][0];
        }

        //peroleh matrix X'X (X transpose multiplied by X)
        XtX_Inv = Inverse.OBE(Multiplies.MultiplyMatrix(Transpose.TransposeMatrix(X), X));

        //peroleh matrix X'Y (X transpose multiplied by Y)
        XtY = Multiplies.MultiplyMatrix(Transpose.TransposeMatrix(X), Y);

        //peroleh niali B (b0, b1, b2) dengan rumus X'X -1 * X'Y
        B = Multiplies.MultiplyMatrix(XtX_Inv, XtY);

        //Y = b0 + b1 X1 + b2 X2
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print(df.format(B[0][0])+ "b0");
        for (int i = 1; i < n + 1; i++) {
            System.out.print(" + " + df.format(B[i][0]) + "b" + i);
        }
        System.out.print(" = Y");
    }
}
