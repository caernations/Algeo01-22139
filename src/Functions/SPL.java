package Functions;
import Matrices.*;
import Operations.Multiplies;

public class SPL {
    public static boolean CheckSolution(double[][] matrix) {
        // untuk ngecheck solusi dari input matriks yg berupa matriks augmented
        int m = matrix.length;
        int n = matrix[0].length;

        double[][] check = Echelon.ReducedRowEchelon(matrix);
        for (int i = 0; i < m; i++) {
            boolean allzero = true;
            for (int j = 0; j < n - 1; j++) {
                if (check[i][j] != 0) {
                    allzero = false;
                    break;
                }
            }
            if (allzero) {
                if (check[i][n-1] == 0) {
                    Parametrik(matrix);
                    return false;
                }
                else if (check[i][n-1] != 0) {
                    System.out.println("Tidak ada solusi.");
                    return false;
                }
            }
        }
        return true;
    }

    public static void Gauss(double[][] matrix, double[] solutions) {
        //solutions x1, x2, ... , xk ada distore di array solutions. BELUM TERMASUK PRINT
        int row = matrix.length;
        int col = matrix[0].length;
        matrix = Echelon.RowEchelon(matrix, 0);

        //kalo punya solusi maka kalkulasi solusi
        if (CheckSolution(matrix)) {
            double sum = 0;
            solutions[col-2] = matrix[row-1][col-1] / matrix[row-1][col-2];

            for (int i = 2; i < row + 1; i++) {
                sum = 0;
                for (int j = col-i; j < col - 1; j ++) {
                    sum += matrix[row-i][j] * solutions[j];
                }

                solutions[col-i-1] = (matrix[row-i][col-1] - sum) / matrix[row-i][row-i];
            }
        }
    }

    public static double[][] DeleteZeros(double[][] matrix) {
        int cnt = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int row = matrix.length;
        int col = matrix[0].length;
        int kurang = 0;

        //Kalo di suatu row semua elemen nya adalah zero, maka row dihapus
        for (int i = 0; i < m; i++) {
            cnt = 0;
            for (int j = 0; j < n; j++) {
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
        for (int i = 0; i < m; i++) {
            cnt = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    cnt++;
                }
            }
            if (cnt == col) {
                kurang++;
            }
            else {
                for (int k = 0; k < n; k++) {
                    deleted[i - kurang][k] = matrix[i][k];
                }
            }
        }

        return deleted;
    }

    public static void GaussJordan(double[][] matrix, double[] solutions) {
        //solutions x1, x2, ... , xk ada distore di array solutions. BELUM TERMASUK PRINT
        int row = matrix.length;
        int col = matrix[0].length;
        matrix = DeleteZeros(Echelon.ReducedRowEchelon(matrix));

        double sum = 0;
        solutions[col - 2] = matrix[row - 1][col - 1] / matrix[row - 1][col - 2];

        for (int i = 2; i < row + 1; i++) {
            sum = 0;
            for (int j = col - i; j < col - 1; j++) {
                sum += matrix[row - i][j] * solutions[j];
            }

            solutions[col - i - 1] = (matrix[row - i][col - 1] - sum) / matrix[row - i][row - i];
        }
    }

    public static void MatriksBalikan(double[][] matrix) {
        //udah termasuk print
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
        //udah termasuk print
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
                det = Determinant.CofactorExp(main);
            }
            else {
                x[idx] = Determinant.CofactorExp(main) / det;
            }
        }

        //Print solusi
        for (int i = 0; i < col - 1; i++) {
            System.out.println("X" + (i+1) + "= " + x[i]);
        }
    }

    public static int FindOne(double[][] matrix, int a) {
        int n = matrix[0].length;
        int i;
        for (i = 0; i < n; i++) {
            if (matrix[a][i] == 1) {
                return i;
            }
        }
        return i;
    }

    public static double recursiveCalculation(int topLimit, int bottomLimit, int currentRow, int variableColumn, double[] resultArray, String[] expressionArray, double[][] matrix) {
        int numRows = matrix.length;
        double cachedValue = 0;
        for (int k = topLimit; k > bottomLimit; k--) {
            if ((resultArray[k] != 0 || !expressionArray[k].isEmpty()) && matrix[currentRow][k] != 0) {
                int rowWithOne = numRows - 1;
                while (matrix[rowWithOne][k] != 1) {
                    rowWithOne--;
                }

                cachedValue = cachedValue + matrix[currentRow][k] * (matrix[rowWithOne][variableColumn])
                        - matrix[currentRow][k] * recursiveCalculation(topLimit, FindOne(matrix, rowWithOne), rowWithOne, variableColumn, resultArray, expressionArray, matrix);
            }
        }
        return cachedValue;
    }

    public static void Parametrik(double[][] matrix) {
        int i, j, k;
        double cachedResult;
        boolean isRealZero;
        boolean isTrivial;
        double[] results = new double[matrix[0].length - 1];
        char[] variables = new char[matrix[0].length - 1];
        String[] expressions = new String[matrix[0].length - 1];
        char currentVariable;

        for (i = 0; i < matrix[0].length - 1; i++) {
            results[i] = 0;
            variables[i] = '/';
            expressions[i] = "";
        }

        currentVariable = 'S';
        matrix = DeleteZeros(matrix);

        for (i = matrix.length - 1; i > -1; i--) {
            cachedResult = matrix[i][matrix[0].length - 1];
            for (j = FindOne(matrix, i) + 1; j < matrix[0].length - 1; j++) {
                if (results[j] == 0) {
                    isRealZero = true;
                    for (k = j; k < matrix[0].length - 1; k++) {
                        if (variables[k] != '/') {
                            isRealZero = false;
                        }
                    }

                    if (j > 0) {
                        for (k = j - 1; k > -1; k--) {
                            if (matrix[i][k] != 0) {
                                isRealZero = false;
                            }
                        }
                    }

                    if (!isRealZero) {
                        if (variables[j] == '/') {
                            variables[j] = currentVariable;
                            if (currentVariable == 'Z') {
                                currentVariable = 'A';
                            } else if (currentVariable == 'R') {
                                currentVariable = 'a';
                            } else {
                                currentVariable += 1;
                            }
                        }
                        double cachedConst = (-1) * matrix[i][j];
                        cachedConst += recursiveCalculation(matrix[0].length - 2, FindOne(matrix, i), i, j, results, expressions, matrix);

                        if (cachedConst > 0) {
                            expressions[FindOne(matrix, i)] += String.format("+%.2f%c", cachedConst, variables[j]);
                        } else if (cachedConst < 0) {
                            expressions[FindOne(matrix, i)] += String.format("%.2f%c", cachedConst, variables[j]);
                        }
                    }
                } else {
                    cachedResult -= results[j] * matrix[i][j];
                }
            }
            try {
                results[FindOne(matrix, i)] = cachedResult;
            } catch (Exception e) {
                // Handle exception
            }
        }

        isTrivial = true;
        for (i = 0; i < matrix[0].length - 1; i++) {
            if (results[i] != 0) {
                isTrivial = false;
            }
        }

        if (isTrivial) {
            for (i = 0; i < matrix[0].length - 1; i++) {
                System.out.print("x");
                System.out.print(i + 1);
                System.out.print(" = ");
            }
            System.out.print(0);
            System.out.println(" or");
        }

        for (i = 0; i < matrix[0].length - 1; i++) {
            System.out.print("x");
            System.out.print(i + 1);
            System.out.print(" = ");
            if (results[i] == 0) {
                isRealZero = true;
                for (j = i; j < matrix[0].length - 1; j++) {
                    if (variables[j] != '/') {
                        isRealZero = false;
                    }
                }
                if (!expressions[i].isEmpty()) {
                    isRealZero = true;
                }

                if (!isRealZero) {
                    if (variables[i] == '/') {
                        variables[i] = currentVariable;
                        if (currentVariable == 'Z') {
                            currentVariable = 'A';
                        } else if (currentVariable == 'R') {
                            currentVariable = 'a';
                        } else {
                            currentVariable += 1;
                        }
                    }
                    System.out.print(variables[i] + "");
                }
                if (isRealZero && expressions[i].isEmpty()) {
                    System.out.print(results[i]);
                }
            } else {
                System.out.print(results[i]);
            }
            System.out.print(expressions[i]);
            System.out.print(", \n");
        }
    }
}
