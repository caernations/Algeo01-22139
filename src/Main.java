import java.util.*;

import Matrices.MatricesIO;
import Matrices.PrintMatrices;
import Matrices.ReadMatrices;
import Operations.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome\n");

        while (true) {
            System.out.println("""
                1. Matrices Operations
                2. System of Linear Equations
                3. Matrices Determinant
                4. Matrices Inverse
                5. Polinomial Interpolation
                6. Bicubic Spline Interpolation
                7. Multiple Linear Regression
                8. Exit
                """);

            System.out.print("Pilih menu: ");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "1":
                case "MATRICES OPERATIONS":
                    boolean matricesMenu = true;
                    while (matricesMenu) {
                        System.out.println("""
                            a. Addition
                            b. Subtraction
                            c. Trace
                            d. Multiply
                            e. Back
                            """);

                        System.out.print("Pilih sub-menu: ");
                        String subChoice = scanner.nextLine().toUpperCase();

                        switch (subChoice) {
                            case "A":
                            case "ADDITION":
                                boolean additionInput = true;
                                while (additionInput) {
                                    System.out.println("""
                                        i.      Keyboard Input
                                        ii.     File Input
                                        iii.    Back
                                        """);
                                    
                                    System.out.println("Choose: ");
                                    String additionInputChoice = scanner.nextLine().toUpperCase();

                                    switch (additionInputChoice){
                                        case "I":
                                        case "KEYBOARD INPUT":
                                            double[][] matrixA1 = ReadMatrices.Keyboard();
                                            System.out.println("Matriks pertama:");
                                            PrintMatrices.Print(matrixA1);

                                            double[][] matrixA2 = ReadMatrices.Keyboard();
                                            System.out.println("Matriks kedua:");
                                            PrintMatrices.Print(matrixA2);

                                            if (matrixA1.length == matrixA2.length && matrixA1[0].length == matrixA2[0].length) {
                                                double[][] resultAddition = Arithmetics.Addition(matrixA1, matrixA2);
                                                if (resultAddition != null) {
                                                    System.out.println("Hasil penjumlahan matriks:");
                                                    PrintMatrices.Print(resultAddition);

                                                    System.out.print("Apakah Anda ingin menyimpan hasil penjumlahan matriks? (Y/N): ");
                                                    String saveChoice = scanner.nextLine().toUpperCase();
                                                    if (saveChoice.equals("Y")) {
                                                        System.out.print("Masukkan nama file output: ");
                                                        String outputFileName = scanner.nextLine();
                                                        MatricesIO.SaveMatrixToFile(resultAddition, outputFileName);
                                                        System.out.println("Hasil penjumlahan matriks telah disimpan ke dalam file " + outputFileName);
                                                    }
                                                } else {
                                                    System.out.println("Jumlah baris dan kolom matriks tidak sama. Penjumlahan tidak dapat dilakukan.");
                                                }
                                            } else {
                                                System.out.println("Jumlah baris dan kolom matriks tidak sama. Penjumlahan tidak dapat dilakukan.");
                                            }

                                            break;


                                        case "II":
                                        case "FILE INPUT":
                                            System.out.print("Masukkan nama file matriks pertama: ");
                                            String inputFileName1 = scanner.nextLine();
                                            double[][] matrixA1ii = MatricesIO.FileToMatrix(inputFileName1);
                                        
                                            System.out.print("Masukkan nama file matriks kedua: ");
                                            String inputFileName2 = scanner.nextLine();
                                            double[][] matrixA2ii = MatricesIO.FileToMatrix(inputFileName2);
                                        
                                            if (matrixA1ii != null && matrixA2ii != null) {
                                                System.out.println("Matriks pertama dari file:");
                                                PrintMatrices.Print(matrixA1ii);
                                        
                                                System.out.println("Matriks kedua dari file:");
                                                PrintMatrices.Print(matrixA2ii);
                                        
                                                if (matrixA1ii.length == matrixA2ii.length && matrixA1ii[0].length == matrixA2ii[0].length) {
                                                    double[][] resultAddition = Arithmetics.Addition(matrixA1ii, matrixA2ii);
                                                    if (resultAddition != null) {
                                                        System.out.println("Hasil penjumlahan matriks:");
                                                        PrintMatrices.Print(resultAddition);
                                        
                                                        System.out.print("Apakah Anda ingin menyimpan hasil penjumlahan matriks? (Y/N): ");
                                                        String saveChoice = scanner.nextLine().toUpperCase();
                                                        if (saveChoice.equals("Y")) {
                                                            System.out.print("Masukkan nama file output: ");
                                                            String outputFileName = scanner.nextLine();
                                                            MatricesIO.SaveMatrixToFile(resultAddition, outputFileName);
                                                        }
                                                    } else {
                                                        System.out.println("Jumlah baris dan kolom matriks tidak sama. Penjumlahan tidak dapat dilakukan.");
                                                    }
                                                } else {
                                                    System.out.println("Jumlah baris dan kolom matriks tidak sama. Penjumlahan tidak dapat dilakukan.");
                                                }
                                            } else {
                                                System.out.println("File input tidak dapat dibaca atau matriks tidak valid.");
                                            }
                                            break;

                                        case "III":
                                        case "BACK":
                                            additionInput = false;
                                            break; 

                                        default:
                                            System.out.println("Invalid.");

                                    }
                                }
                                break;

                            case "B":
                            case "SUBTRACTION":
                                boolean subtractionInput = true;
                                while (subtractionInput) {
                                    System.out.println("""
                                        i.      Keyboard Input
                                        ii.     File Input
                                        iii.    Back
                                        """);
                                    
                                    System.out.println("Choose: ");
                                    String subtractionInputChoice = scanner.nextLine().toUpperCase();

                                    switch (subtractionInputChoice){
                                        case "I":
                                        case "KEYBOARD INPUT":
                                            double[][] matrixB1 = ReadMatrices.Keyboard();
                                            System.out.println("Matriks pertama:");
                                            PrintMatrices.Print(matrixB1);
        
                                            double[][] matrixB2 = ReadMatrices.Keyboard();
                                            System.out.println("Matriks kedua:");
                                            PrintMatrices.Print(matrixB2);
        
                                            if (matrixB1.length == matrixB2.length && matrixB1[0].length == matrixB2[0].length) {
                                                double[][] resultSubtraction = Arithmetics.Subtraction(matrixB1, matrixB2);
                                                if (resultSubtraction != null) {
                                                    System.out.println("Hasil pengurangan matriks:");
                                                    PrintMatrices.Print(resultSubtraction);
                                                } else {
                                                    System.out.println("Jumlah baris dan kolom matriks tidak sama. Pengurangan tidak dapat dilakukan.");
                                                }
                                            } else {
                                                System.out.println("Jumlah baris dan kolom matriks tidak sama. Pengurangan tidak dapat dilakukan.");
                                            }

                                            break;

                                        case "II":
                                        case "FILE INPUT":
                                            break;
                                        
                                        case "III":
                                        case "BACK":
                                            subtractionInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");

                                    }
                                }
                                break;

                            case "C":
                            case "TRACE": 
                                boolean traceInput = true;
                                while (traceInput) {
                                    System.out.println("""
                                        i.      Keyboard Input
                                        ii.     File Input
                                        iii.    Back
                                        """);
                                    
                                    System.out.println("Choose: ");
                                    String traceInputChoice = scanner.nextLine().toUpperCase();

                                    switch (traceInputChoice){
                                        case "I":
                                        case "KEYBOARD INPUT":
                                            double[][] matrixC = ReadMatrices.Keyboard();
                                            System.out.println("Matriks pertama:");
                                            PrintMatrices.Print(matrixC);
        
                                            if (matrixC.length == matrixC[0].length) {
                                                double trace = Arithmetics.Trace(matrixC);
                            
                                                if (!Double.isNaN(trace)) {
                                                    System.out.println("Trace dari matriks adalah: " + trace);
                                                } else {
                                                    System.out.println("Matriks harus merupakan matriks persegi untuk menghitung trace.");
                                                }
                                            } else {
                                                System.out.println("Matriks harus merupakan matriks persegi untuk menghitung trace.");
                                            }

                                            break;

                                        case "II":
                                        case "FILE INPUT":
                                            break;
                                        
                                        case "III":
                                        case "BACK":
                                            subtractionInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");

                                    }
                                }
                                break;                             

                            case "D":
                            case "MULTIPLY MATRICES":
                                boolean multiplyMenu = true;
                                while (multiplyMenu) {
                                    System.out.println("""
                                        i.      Multiply Matrices
                                        ii.     Multiply Matrices by Constant
                                        iii.    Multiply Matrices With Mod
                                        iv.     Back
                                        """);

                                    System.out.print("Choose: ");
                                    String multiplyChoice = scanner.nextLine().toUpperCase();

                                    switch (multiplyChoice) {
                                        case "I":
                                        case "MULTIPLY MATRICES":
                                            boolean iMultiplyInput = true;
                                            while (iMultiplyInput) {
                                                System.out.println("""
                                                    i.      Keyboard Input
                                                    ii.     File Input
                                                    iii.    Back
                                                    """);
                                                System.out.println("Choose: ");
                                                String iMultiplyInputChoice = scanner.nextLine().toUpperCase();

                                                switch (iMultiplyInputChoice){
                                                    case "I":
                                                    case "KEYBOARD INPUT":
                                                        double[][] matrixiD1 = ReadMatrices.Keyboard();
                                                        double[][] matrixiD2 = ReadMatrices.Keyboard();
                                                        
                                                        double[][] resultMultiplyMatrix = Multiplies.MultiplyMatrix(matrixiD1, matrixiD2);
                                                    
                                                        if (resultMultiplyMatrix == null) {
                                                            System.out.println("Error: Jumlah kolom matriks pertama tidak sama dengan jumlah baris matriks kedua.");
                                                        } else {
                                                            System.out.println("Matriks pertama:");
                                                            PrintMatrices.Print(matrixiD1);
                                                    
                                                            System.out.println("Matriks kedua:");
                                                            PrintMatrices.Print(matrixiD2);
                                                    
                                                            System.out.println("Hasil perkalian matriks: ");
                                                            PrintMatrices.Print(resultMultiplyMatrix);
                                                        }
                                                        break;
                                                    
                                                    case "II":
                                                    case "FILE INPUT":
                                                    case "III":
                                                    case "BACK":
                                                }
                                            }

                                        case "II":
                                        case "MULTIPLY MATRICES BY CONSTANT":
                                            boolean iiMultiplyInput = true;
                                            while (iiMultiplyInput) {
                                                System.out.println("""
                                                    i.      Keyboard Input
                                                    ii.     File Input
                                                    iii.    Back
                                                    """);
                                                System.out.println("Choose: ");
                                                String iiMultiplyInputChoice = scanner.nextLine().toUpperCase();
                                                switch (iiMultiplyInputChoice){
                                                    case "I":
                                                    case "KEYBOARD INPUT":
                                                        double[][] matrixiiD1 = ReadMatrices.Keyboard();

                                                        System.out.println("Constanta: ");
                                                        double constant = scanner.nextDouble();
                                                        scanner.nextLine();
                                                        
                                                        double[][] resultMultiplyMatrixByConstant = Multiplies.MultiplyMatrixByConstant(matrixiiD1, constant);

                                                        System.out.println("Result:");
                                                        PrintMatrices.Print(resultMultiplyMatrixByConstant);
                                                        break;

                                                    case "II":
                                                    case "FILE INPUT":
                                                        break;

                                                    case "III":
                                                    case "BACK":
                                                        iiMultiplyInput = false;
                                                        break;
                                                }
                                            }
                                            break;


                                        case "III":
                                        case "MULTIPLY MATRIX WITH MOD":
                                            boolean iiiMultiplyInput = true;
                                            while (iiiMultiplyInput) {
                                                System.out.println("""
                                                    i.      Keyboard Input
                                                    ii.     File Input
                                                    iii.    Back
                                                    """);

                                                System.out.println("Choose: ");
                                                String iiiMultiplyInputChoice = scanner.nextLine().toUpperCase();

                                                switch (iiiMultiplyInputChoice){
                                                    case "I":
                                                    case "KEYBOARD INPUT":
                                                        double[][] matrix1 = ReadMatrices.Keyboard();
                                                        double[][] matrix2 = ReadMatrices.Keyboard();

                                                        System.out.println("Enter the mod value: ");
                                                        double mod = scanner.nextDouble();
                                                        scanner.nextLine();

                                                        if (matrix1[0].length != matrix2.length) {
                                                            System.out.println("Error: Jumlah kolom matriks pertama tidak sama dengan jumlah baris matriks kedua.");
                                                        } else {
                                                            double[][] resultMultiplyMatrixWithMod = Multiplies.MultiplyMatrixWithMod(matrix1, matrix2, mod);

                                                            System.out.println("Result:");
                                                            PrintMatrices.Print(resultMultiplyMatrixWithMod);
                                                        }
                                                        break;

                                                    case "II":
                                                    case "FILE INPUT":

                                                        break;

                                                    case "III":
                                                    case "BACK":
                                                        iiiMultiplyInput = false;
                                                        break;
                                                }
                                            }
                                            break;


                                        case "IV":
                                        case "BACK":
                                            multiplyMenu = false;
                                            break;

                                        default:
                                            System.out.println("Pilihan sub-menu tidak valid.");
                                    }
                                }
                                break;

                            case "E":
                            case "BACK":
                                matricesMenu = false;
                                break;

                            default:
                                System.out.println("Pilihan sub-menu tidak valid.");
                        }
                    }
                    break;

                case "2":
                case "SYSTEM OF LINEAR EQUATIONS":
                    // SPL
                    boolean splMenu = true;
                    while (splMenu) {
                        System.out.println("""
                            a. Gauss Elimination Method
                            b. Gauss-Jordan Elimination Method
                            c. Inverse Matrices Method
                            d. Cramer Method
                            e. Back
                            """);
                        
                        System.out.println("Choose: ");
                        String splChoice = scanner.nextLine().toUpperCase();
    
                        switch (splChoice) {
                            case "A":
                            case "GAUSS ELIMINATION METHOD":
                                // nama1
                                break;
    
                            case "B":
                            case "GAUSS-JORDAN ELIMINATION METHOD":
                                // nama2
                                break;
    
                            case "C":
                            case "INVERSE MATRICES METHOD":
                                // nama2
                                break;
    
                            case "D":
                            case "CRAMER METHOD":
                                // nama2
                                break;
                            
                            case "E":
                            case "BACK":
                                splMenu = false;
                                break;
                            
                            default:
                                System.out.println("Tidak valid.");
                        }
                    }
                    break;

                case "3":
                case "MATRICES DETERMINANT":
                    boolean determinantMenu = true;
                    while (determinantMenu) {
                        System.out.println("""
                            a. Cofactor Expansion Method
                            b. det2
                            c. Back
                            """);
                        
                        System.out.println("Choose: ");
                        String determinantChoice = scanner.nextLine().toUpperCase();

                        switch (determinantChoice) {
                            case "A":
                            case "Cofactor Expansion Method":
                                // nama1
                                break;

                            case "B":
                            case "det2":
                                // nama2
                                break;
                            
                            case "C":
                            case "BACK":
                                determinantMenu = false;
                                break;
                            
                            default:
                                System.out.println("Tidak valid.");
                        }
                    }
                    break;
                    
                case "4":
                case "MATRICES INVERSE":
                    boolean inverseMenu = true;
                    while (inverseMenu) {
                        System.out.println("""
                            a. Inverse Matrices Method
                            b. Adjoint Method
                            c. Back
                            """);
                        
                        System.out.println("Choose: ");
                        String inverseChoice = scanner.nextLine().toUpperCase();

                        switch (inverseChoice) {
                            case "A":
                            case "INVERSE MATRICES METHOD":
                                // nama1
                                break;

                            case "B":
                            case "ADJOINT METHOD":
                                // nama2
                                break;
                            
                            case "C":
                            case "BACK":
                                inverseMenu = false;
                                break;
                            
                            default:
                                System.out.println("Tidak valid.");
                        }
                    }
                    break;

                case "5":
                case "POLINOMIAL INTERPOLATION":
                    // Polinomial Interpolation
                    break;

                case "6":
                case "BICUBIC SPLINE INTERPOLATION":
                    // Bicubic
                    break;

                case "7":
                case "MULTIPLE LINEAR REGRESSION":
                    // Regresi
                    break;

                case "8":
                case "EXIT":
                    System.out.println("byeeee.");
                    System.exit(0);

                default:
                    System.out.println("Invalid.");
            }
        }
    }


    public static void cls() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
