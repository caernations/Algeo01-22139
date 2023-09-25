import Matrices.*;
import Operations.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");

        double[][] matrix1 = ReadMatrices.Keyboard();
        System.out.println("Matriks pertama:");
        PrintMatrices.Print(matrix1);

        double[][] matrix2 = ReadMatrices.Keyboard();
        System.out.println("Matriks kedua:");
        PrintMatrices.Print(matrix2);

        double[][] resultAddition = Arithmetics.Addition(matrix1, matrix2);
        System.out.println("Hasil penjumlahan matriks:");
        PrintMatrices.Print(resultAddition);

        double[][] resultSubtraction = Arithmetics.Subtraction(matrix1, matrix2);
        System.out.println("Hasil pengurangan matriks:");
        PrintMatrices.Print(resultSubtraction);
    }
}
