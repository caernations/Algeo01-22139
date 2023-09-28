package Functions;
import Matrices.*;
import Operations.Multiplies;
import static java.lang.Math.round;

public class SPL {
    public static boolean CheckSolution(double[][] matrix) {
        int cnt = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        boolean solusi = true;

        //check tidak punya solusi dan solusi banyak
        for (int i = 0; i < row; i++) {
            cnt = 0;
            for (int j = 0; j < col; j++) {
                if (j != col - 1) {
                    if (matrix[i][j] != 0) {
                        cnt++;
                    }
                } else {
                    if (cnt == 0 && matrix[i][j] != 0) {
                        System.out.println("Matriks tidak memiliki solusi");
                        solusi = false;
                        break;
                    } else if (cnt == 0 && matrix[i][j] == 0) {
                        System.out.println("Matriks memiliki banyak solusi");
                        solusi = false;
                        break;
                    }
                }
            }
        }
        return solusi;
    }

    public static void Gauss(double[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        matrix = Echelon.RowEchelon(matrix);

        //kalo punya solusi maka kalkulasi solusi
        if (CheckSolution(matrix)) {
            double[] x = new double[col-1];
            double sum = 0;
            x[col-2] = matrix[row-1][col-1] / matrix[row-1][col-2];

            for (int i = 2; i < row + 1; i++) {
                sum = 0;
                for (int j = col-i; j < col - 1; j ++) {
                    sum += matrix[row-i][j] * x[j];
                }

                x[col-i-1] = (matrix[row-i][col-1] - sum) / matrix[row-i][row-i];
            }

            //print solusi x unik
            for (int i = 0; i < col - 1; i++) {
                System.out.println("X" + (i+1) + "= " + round(x[i]));
            }
        }

    }

    public static double[][] DeleteZeros(double[][] matrix) {
        int cnt = 0;
        int row = matrix.length;
        int col = matrix[0].length;

        //Kalo di suatu row semua elemen nya adalah zero, maka row dihapus
        for (int i = 0; i < row + 1; i++) {
            cnt = 0;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    cnt++;
                }
            }
            if (cnt == col) {
                row--;
            }
        }

        //bikin matrix baru
        double[][] deleted = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                deleted[i][j] = matrix[i][j];
            }
        }

        return deleted;
    }

    public static void GaussJordan(double[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        matrix = DeleteZeros(Echelon.ReducedRowEchelon(matrix));

        double[] x = new double[col-1];
        double sum = 0;
        x[col-2] = matrix[row-1][col-1] / matrix[row-1][col-2];

        for (int i = 2; i < row + 1; i++) {
            sum = 0;
            for (int j = col-i; j < col - 1; j ++) {
                sum += matrix[row-i][j] * x[j];
            }

            x[col-i-1] = (matrix[row-i][col-1] - sum) / matrix[row-i][row-i];
            //System.out.println("X=" + (col-i-1) + "=" + (matrix[row-i][col-1]) + "-" + sum + "/" + matrix[row-i][row-i]);
        }

        //print solusi
        for (int i = 0; i < col - 1; i++) {
            System.out.println("X" + (i+1) + "= " + round(x[i]));
        }
    }

    public static void MatriksBalikan(double[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        //deklarasi matriks A dan B
        double[][] matriksA = new double[row][col-1];
        double[][] matriksb = new double[row][1];
        double[][] result = new double[row][1];

        //pisah matriks A dan b
        for (int i = 0; i < row; i ++) {
            for (int j = 0; j < col - 1; j++) {
                matriksA[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < row; i ++) {
            matriksb[i][0] = matrix[i][col-1];
        }

        //x = x = A-1 x B
        result = Multiplies.MultiplyMatrix(Inverse.OBE(matriksA), matriksb);

        //print solusi
        for (int i = 0; i < col - 1; i++) {
            System.out.println("X" + (i+1) + "= " + result[i][0]);
        }
    }

    public static void Cramer(double[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        //Deklarasi matriks main dan konstanta
        double[][] main = new double[row][col-1];
        double[][] konstanta = new double[row][1];

        //Pisahin matriks konstanta
        for (int i = 0; i < row; i ++) {
            konstanta[i][0] = matrix[i][col-1];
        }

        //Deklarasi variabel determinan dan array x (solusi)
        double det = 0;
        double[] x = new double[row];

        //Assign determinan, lalu ganti salah satu kolom dengan konstanta untuk mengkalkulasi x = Dx/D
        for (int idx = -1; idx < row; idx++) {
            for (int i = 0; i < row; i ++) {
                for (int j = 0; j < col-1; j ++) {
                    if (j == idx) {
                        main[i][j] = konstanta[i][0];
                    }
                    else {
                        main[i][j] = matrix[i][j];
                    }
                }
            }

            if (idx == -1) {
                det = Determinant.CalcDeterminant(main);
            }
            else {
                x[idx] = Determinant.CalcDeterminant(main) / det;
            }
        }

        //Print solusi
        for (int i = 0; i < col - 1; i++) {
            System.out.println("X" + (i+1) + "= " + x[i]);
        }
    }
}
