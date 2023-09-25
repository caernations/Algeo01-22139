import java.util.Scanner;
import Matrices.*;
import Operations.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome\n");

        double[][] matrix1 = ReadMatrices.Keyboard();
        System.out.print("Matriks pertama:");
        PrintMatrices.Print(matrix1);
        System.out.println();
        
        double[][] matrix2 = ReadMatrices.Keyboard();
        System.out.print("Matriks kedua:");
        PrintMatrices.Print(matrix2);
        System.out.println();
        
        double[][] resultAddition = Arithmetics.Addition(matrix1, matrix2);
        System.out.print("Hasil penjumlahan matriks: ");
        PrintMatrices.Print(resultAddition);
        System.out.println();
        
        double[][] resultSubtraction = Arithmetics.Subtraction(matrix1, matrix2);
        System.out.print("Hasil pengurangan matriks: ");
        PrintMatrices.Print(resultSubtraction);
        System.out.println();
        
        double[][] resultMultiplyMatrix = Multiplies.MultiplyMatrix(matrix1, matrix2);
        System.out.print("Hasil perkalian matriks: ");
        PrintMatrices.Print(resultMultiplyMatrix);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan constant untuk perkalian dengan matriks: ");
        double constant = scanner.nextDouble();
        double[][] resultMultiplyByConst = Multiplies.MultiplyMatrixByConstant(matrix1, constant);
        System.out.printf("Hasil perkalian matriks dengan constant %f: ", constant);
        PrintMatrices.Print(resultMultiplyByConst);

        System.out.print("Masukkan nilai mod untuk perkalian matriks dengan modulo: ");
        double mod = scanner.nextDouble();
        double[][] resultMultiplyWithMod = Multiplies.MultiplyMatrixWithMod(matrix1, matrix2, mod);
        System.out.printf("Hasil perkalian matriks dengan modulo %.2f: ", mod);
        PrintMatrices.Print(resultMultiplyWithMod);

        scanner.close();
    }
}
