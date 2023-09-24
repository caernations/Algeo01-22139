import Matrices.ReadMatrices;
import Matrices.PrintMatrices;
import Operations.Arithmetics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");

        double[][] matrix1 = ReadMatrices.Keyboard();
        System.out.println("Matriks pertama:");
        PrintMatrices.print(matrix1);

        double[][] matrix2 = ReadMatrices.Keyboard();
        System.out.println("Matriks kedua:");
        PrintMatrices.print(matrix2);

        double[][] resultAddition = Arithmetics.addition(matrix1, matrix2);
        System.out.println("Hasil penjumlahan matriks:");
        PrintMatrices.print(resultAddition);

        double[][] resultSubtraction = Arithmetics.subtraction(matrix1, matrix2);
        System.out.println("Hasil penjumlahan matriks:");
        PrintMatrices.print(resultSubtraction);
    }
}