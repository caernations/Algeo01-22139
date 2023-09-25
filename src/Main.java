import Matrices.*;
import Operations.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");

        double[][] matrix1 = ReadMatrices.Keyboard();
        System.out.println("ini nyoba fungsi:");
        PrintMatrices.Print(Echelon.ReducedRowEchelon(matrix1));
    }
}
