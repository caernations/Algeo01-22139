import Matrices.ReadMatrices;
import Matrices.PrintMatrices;
import Operations.Arithmetics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");

        double[][] matrix;
        matrix = ReadMatrices.Keyboard();
        PrintMatrices.print(matrix);


    }
}