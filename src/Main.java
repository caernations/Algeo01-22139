import java.util.*;

import Matrices.MatricesIO;
import Matrices.PrintMatrices;
import Matrices.ReadMatrices;
import Operations.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("""
            
        █▀▄▀█ ▄▀█ ▀█▀ █▀█ █ █▀▀ █▀▀ █▀
        █░▀░█ █▀█ ░█░ █▀▄ █ █▄▄ ██▄ ▄█

        █▀▀ ▄▀█ █░░ █▀▀ █░█ █░░ ▄▀█ ▀█▀ █▀█ █▀█
        █▄▄ █▀█ █▄▄ █▄▄ █▄█ █▄▄ █▀█ ░█░ █▄█ █▀▄

            ▐▓█▀▀▀▀▀▀▀▀▀█▓▌░▄▄▄▄▄░
            ▐▓█░░▀░░▀▄░░█▓▌░█▄▄▄█░
            ▐▓█░░▄░░▄▀░░█▓▌░█▄▄▄█░
            ▐▓█▄▄▄▄▄▄▄▄▄█▓▌░█████░
            ░░░░▄▄███▄▄░░░░░█████░

        ░ © 2023 | 13522139, 13522140, 13522147 ░""");
        System.out.println("═════════════════════════════════════════\n\n");


        while (true) {
            System.out.println("""

                █▀▄▀█ █▀▀ █▄░█ █░█ ▀
                █░▀░█ ██▄ █░▀█ █▄█ ▄

                """);
            System.out.println("""
                ░ 1. Matrices Operations
                ░ 2. System of Linear Equations
                ░ 3. Matrices Determinant
                ░ 4. Matrices Inverse
                ░ 5. Polinomial Interpolation
                ░ 6. Bicubic Spline Interpolation
                ░ 7. Multiple Linear Regression
                ░ 8. Help
                ░ 9. Exit
                """);

            System.out.print("░ >> Choose menu: ");
            String choice = scanner.nextLine().toUpperCase();

            pause();
            cls();

            switch (choice) {
                case "1":
                case "MATRICES OPERATIONS":
                    boolean operationsMenu = true;
                    while (operationsMenu) {
                        System.out.println("""
                            
                            █▀█ █▀█ █▀▀ █▀█ ▄▀█ ▀█▀ █ █▀█ █▄░█ █▀
                            █▄█ █▀▀ ██▄ █▀▄ █▀█ ░█░ █ █▄█ █░▀█ ▄█


                            ░ 1. Addition (+)
                            ░ 2. Subtraction (-)
                            ░ 3. Trace (tr)
                            ░ 4. Multiply (*)
                            ░ 5. Transpose (T)
                            ░ 6. Row Echelon
                            ░ 7. Reduced Row Echelon
                            ░ 8. Back
                            """);

                        System.out.print("░ >> Choose operation: ");
                        String subChoice = scanner.nextLine().toUpperCase();

                        pause();
                        cls();

                        switch (subChoice) {
                            case "1":
                            case "+":
                            case "ADDITION":
                                boolean additionInput = true;
                                while (additionInput) {
                                    System.out.println("""
                                        
                                        ▄▀█ █▀▄ █▀▄ █ ▀█▀ █ █▀█ █▄░█
                                        █▀█ █▄▀ █▄▀ █ ░█░ █ █▄█ █░▀█


                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);
                                    
                                    System.out.print("░ >> Choose: ");
                                    String additionInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();
                                    
                                    switch (additionInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                ▄▀█ █▀▄ █▀▄ █ ▀█▀ █ █▀█ █▄░█
                                                █▀█ █▄▀ █▄▀ █ ░█░ █ █▄█ █░▀█


                                                """);
                                            System.out.println("""
                                                ─────────────────────
                                                ░  M A T R I X  1 : ░
                                                ─────────────────────
                                                """);
                                            double[][] matrixA1 = ReadMatrices.Keyboard();
                                            System.out.println("""
                                                \n
                                                ─────────────────────
                                                ░  M A T R I X  2 : ░
                                                ─────────────────────
                                                """);
                                            double[][] matrixA2 = ReadMatrices.Keyboard();

                                            if (matrixA1.length == matrixA2.length && matrixA1[0].length == matrixA2[0].length) {
                                                double[][] resultAddition = Arithmetics.Addition(matrixA1, matrixA2);
                                                if (resultAddition != null) {
                                                    System.out.print("""
                                                        \n
                                                        ────────────────────────────
                                                        ░         H A S I L        ░
                                                        ░  P E N J U M L A H A N : ░
                                                        ────────────────────────────
                                                        """);
                                                    PrintMatrices.Print(resultAddition);

                                                    pause();

                                                    System.out.println("""

                                                    

                                                        █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                        ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                        """);
                                                    System.out.print(">> ");
                                                    String saveChoice = scanner.nextLine().toUpperCase();
                                                    if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                        System.out.print(">> Save as: ");
                                                        String outputFileName = scanner.nextLine();
                                                        MatricesIO.SaveMatrixToFile(resultAddition, outputFileName);
                                                        System.out.println(">> Saved as " + outputFileName + "!\n");
                                                    } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                        System.out.println("Not saved.");
                                                    } else {
                                                        System.out.println("Invalid.");
                                                    }

                                                    pause();
                                                    cls();

                                                } else {
                                                    System.out.println("Jumlah baris dan kolom matriks tidak sama. Penjumlahan tidak dapat dilakukan.");
                                                }
                                            } else {
                                                System.out.println("\n>> Jumlah baris dan kolom matriks tidak sama.\n>> Penjumlahan tidak dapat dilakukan.");
                                                pause();
                                                cls();
                                            }

                                            break;


                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                ▄▀█ █▀▄ █▀▄ █ ▀█▀ █ █▀█ █▄░█
                                                █▀█ █▄▀ █▄▀ █ ░█░ █ █▄█ █░▀█


                                                """);
                                            System.out.print("░ >> Matrix 1 file name: ");
                                            String inputFileName1 = scanner.nextLine();
                                            double[][] matrixA1ii = MatricesIO.FileToMatrix(inputFileName1);
                                            System.out.print("░ >> Matrix 2 file name: ");
                                            String inputFileName2 = scanner.nextLine();
                                            double[][] matrixA2ii = MatricesIO.FileToMatrix(inputFileName2);
                                        
                                            if (matrixA1ii != null && matrixA2ii != null) {
                                                System.out.print("""


                                                    ─────────────────────
                                                    ░  M A T R I X  1 : ░
                                                    ─────────────────────
                                                    """);
                                                PrintMatrices.Print(matrixA1ii);
                                                System.out.print("""


                                                    ─────────────────────
                                                    ░  M A T R I X  2 : ░
                                                    ─────────────────────
                                                    """);
                                                PrintMatrices.Print(matrixA2ii);
                                        
                                                if (matrixA1ii.length == matrixA2ii.length && matrixA1ii[0].length == matrixA2ii[0].length) {
                                                    double[][] resultAddition = Arithmetics.Addition(matrixA1ii, matrixA2ii);
                                                    if (resultAddition != null) {
                                                        System.out.print("""
                                                            \n
                                                            ────────────────────────────
                                                            ░         H A S I L        ░
                                                            ░  P E N J U M L A H A N : ░
                                                            ────────────────────────────
                                                            """);
                                                        PrintMatrices.Print(resultAddition);

                                                        pause();

                                                        System.out.println("""

                                                        

                                                            █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                            ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                            """);
                                                        System.out.print(">> ");
                                                        String saveChoice = scanner.nextLine().toUpperCase();
                                                        if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                            System.out.print(">> Save as: ");
                                                            String outputFileName = scanner.nextLine();
                                                            MatricesIO.SaveMatrixToFile(resultAddition, outputFileName);
                                                            System.out.println(">> Saved as " + outputFileName + "!\n");
                                                        } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                            System.out.println("Not saved.");
                                                        } else {
                                                            System.out.println("Invalid.");
                                                        }

                                                        pause();
                                                        cls();

                                                    } else {
                                                        System.out.println("Jumlah baris dan kolom matriks tidak sama. Penjumlahan tidak dapat dilakukan.");
                                                    }
                                                } else {
                                                    System.out.println("\n>> Jumlah baris dan kolom matriks tidak sama.\n>> Penjumlahan tidak dapat dilakukan.");
                                                    pause();
                                                    cls();
                                                }
                                            }
                                                break;

                                        case "3":
                                        case "BACK":
                                            additionInput = false;
                                            break; 

                                        default:
                                            System.out.println("Invalid.");

                                    }
                                }
                                break;

                            case "2":
                            case "-":
                            case "SUBTRACTION":
                                boolean subtractionInput = true;
                                while (subtractionInput) {
                                    System.out.println("""

                                        █▀ █░█ █▄▄ ▀█▀ █▀█ ▄▀█ █▀▀ ▀█▀ █ █▀█ █▄░█
                                        ▄█ █▄█ █▄█ ░█░ █▀▄ █▀█ █▄▄ ░█░ █ █▄█ █░▀█


                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);
                                    
                                    System.out.print("░ >> Choose: ");
                                    String subtractionInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (subtractionInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                █▀ █░█ █▄▄ ▀█▀ █▀█ ▄▀█ █▀▀ ▀█▀ █ █▀█ █▄░█
                                                ▄█ █▄█ █▄█ ░█░ █▀▄ █▀█ █▄▄ ░█░ █ █▄█ █░▀█


                                                """);
                                            System.out.println("""
                                                ─────────────────────
                                                ░  M A T R I X  1 : ░
                                                ─────────────────────
                                                """);
                                            double[][] matrixA1 = ReadMatrices.Keyboard();
                                            System.out.println("""
                                                \n
                                                ─────────────────────
                                                ░  M A T R I X  2 : ░
                                                ─────────────────────
                                                """);
                                            double[][] matrixA2 = ReadMatrices.Keyboard();

                                            if (matrixA1.length == matrixA2.length && matrixA1[0].length == matrixA2[0].length) {
                                                double[][] resultSubtraction = Arithmetics.Subtraction(matrixA1, matrixA2);
                                                if (resultSubtraction != null) {
                                                    System.out.print("""
                                                        \n
                                                        ────────────────────────────
                                                        ░         H A S I L        ░
                                                        ░  P E N G U R A N G A N : ░
                                                        ────────────────────────────
                                                        """);
                                                    PrintMatrices.Print(resultSubtraction);

                                                    pause();

                                                    System.out.println("""

                                                    

                                                        █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                        ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                        """);
                                                    System.out.print(">> ");
                                                    String saveChoice = scanner.nextLine().toUpperCase();
                                                    if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                        System.out.print(">> Save as: ");
                                                        String outputFileName = scanner.nextLine();
                                                        MatricesIO.SaveMatrixToFile(resultSubtraction, outputFileName);
                                                        System.out.println(">> Saved as " + outputFileName + "!\n");
                                                    } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                        System.out.println("Not saved.");
                                                    } else {
                                                        System.out.println("Invalid.");
                                                    }

                                                    pause();
                                                    cls();

                                                } else {
                                                    System.out.println("Jumlah baris dan kolom matriks tidak sama. Pengurangan tidak dapat dilakukan.");
                                                }
                                            } else {
                                                System.out.println("\n>> Jumlah baris dan kolom matriks tidak sama.\n>> Pengurangan tidak dapat dilakukan.");
                                                pause();
                                                cls();
                                            }

                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                █▀ █░█ █▄▄ ▀█▀ █▀█ ▄▀█ █▀▀ ▀█▀ █ █▀█ █▄░█
                                                ▄█ █▄█ █▄█ ░█░ █▀▄ █▀█ █▄▄ ░█░ █ █▄█ █░▀█


                                                """);
                                            System.out.print("░ >> Matrix 1 file name: ");
                                            String inputFileName1 = scanner.nextLine();
                                            double[][] matrixA1ii = MatricesIO.FileToMatrix(inputFileName1);
                                            System.out.print("░ >> Matrix 2 file name: ");
                                            String inputFileName2 = scanner.nextLine();
                                            double[][] matrixA2ii = MatricesIO.FileToMatrix(inputFileName2);
                                        
                                            if (matrixA1ii != null && matrixA2ii != null) {
                                                System.out.print("""


                                                    ─────────────────────
                                                    ░  M A T R I X  1 : ░
                                                    ─────────────────────
                                                    """);
                                                PrintMatrices.Print(matrixA1ii);
                                                System.out.print("""


                                                    ─────────────────────
                                                    ░  M A T R I X  2 : ░
                                                    ─────────────────────
                                                    """);
                                                PrintMatrices.Print(matrixA2ii);
                                        
                                                if (matrixA1ii.length == matrixA2ii.length && matrixA1ii[0].length == matrixA2ii[0].length) {
                                                    double[][] resultSubtraction = Arithmetics.Subtraction(matrixA1ii, matrixA2ii);
                                                    if (resultSubtraction != null) {
                                                        System.out.print("""
                                                            \n
                                                            ────────────────────────────
                                                            ░         H A S I L        ░
                                                            ░  P E N G U R A N G A N : ░
                                                            ────────────────────────────
                                                            """);
                                                        PrintMatrices.Print(resultSubtraction);

                                                        pause();

                                                        System.out.println("""

                                                        

                                                            █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                            ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                            """);
                                                        System.out.print(">> ");
                                                        String saveChoice = scanner.nextLine().toUpperCase();
                                                        if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                            System.out.print(">> Save as: ");
                                                            String outputFileName = scanner.nextLine();
                                                            MatricesIO.SaveMatrixToFile(resultSubtraction, outputFileName);
                                                            System.out.println(">> Saved as " + outputFileName + "!\n");
                                                        } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                            System.out.println("Not saved.");
                                                        } else {
                                                            System.out.println("Invalid.");
                                                        }

                                                        pause();
                                                        cls();

                                                    } else {
                                                        System.out.println("Jumlah baris dan kolom matriks tidak sama. Pengurangan tidak dapat dilakukan.");
                                                    }
                                                } else {
                                                    System.out.println("\n>> Jumlah baris dan kolom matriks tidak sama.\n>> Pengurangan tidak dapat dilakukan.");
                                                    pause();
                                                    cls();
                                                }
                                            }
                                                break;
                                        
                                        case "3":
                                        case "BACK":
                                            subtractionInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");

                                    }
                                }
                                break;

                            case "3":
                            case "TR":
                            case "TRACE": 
                                boolean traceInput = true;
                                while (traceInput) {
                                    System.out.println("""

                                        ▀█▀ █▀█ ▄▀█ █▀▀ █▀▀
                                        ░█░ █▀▄ █▀█ █▄▄ ██▄


                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);
                                    
                                    System.out.print("░ >> Choose: ");
                                    String traceInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (traceInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                ▀█▀ █▀█ ▄▀█ █▀▀ █▀▀
                                                ░█░ █▀▄ █▀█ █▄▄ ██▄


                                                """);
                                             System.out.println("""
                                                ──────────────────
                                                ░  M A T R I X : ░
                                                ──────────────────
                                                """);
                                            double[][] matrixC = ReadMatrices.Keyboard();
        
                                            if (matrixC.length == matrixC[0].length) {
                                                double resultTrace = Arithmetics.Trace(matrixC);
                            
                                                if (!Double.isNaN(resultTrace)) {
                                                    System.out.print("""
                                                        \n
                                                        ──────────────────
                                                        ░  M A T R I X   ░
                                                        ░   T R A C E :  ░
                                                        ──────────────────

                                                        """);
                                                    System.out.println(">> tr = " + resultTrace);
                                                    pause();

                                                    System.out.println("""

                                                    

                                                        █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                        ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                        """);
                                                    System.out.print(">> ");
                                                    String saveChoice = scanner.nextLine().toUpperCase();

                                                    if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                        System.out.print(">> Save as: ");
                                                        String outputFileName = scanner.nextLine();

                                                        String traceToSave = "tr = " + resultTrace;
                                                        MatricesIO.SaveStringToFile(traceToSave, outputFileName);
                                                        System.out.println(">> Saved as " + outputFileName + "!\n");

                                                    } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                        System.out.println("Not saved.");

                                                    } else {
                                                        System.out.println("Invalid.");
                                                    }

                                                    pause();
                                                    cls();

                                                } else {
                                                    System.out.println("Invalid: Matriks harus merupakan matriks persegi untuk menghitung trace.");
                                                }
                                            } else {
                                                System.out.println("Invalid: Matriks harus merupakan matriks persegi untuk menghitung trace.");
                                                pause();
                                                cls();
                                            }

                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                ▀█▀ █▀█ ▄▀█ █▀▀ █▀▀
                                                ░█░ █▀▄ █▀█ █▄▄ ██▄


                                                """);
                                            System.out.print("░ >> Matrix file name: ");
                                            String inputFileName1 = scanner.nextLine();
                                            double[][] matrixC2 = MatricesIO.FileToMatrix(inputFileName1);
        
                                            if (matrixC2 != null) {
                                                double resultTrace = Arithmetics.Trace(matrixC2);
                            
                                                if (!Double.isNaN(resultTrace)) {

                                                    System.out.println("""


                                                        ──────────────────
                                                        ░  M A T R I X : ░
                                                        ──────────────────""");
                                                    PrintMatrices.Print(matrixC2);
                                                    System.out.print("""
                                                        \n
                                                        ──────────────────
                                                        ░  M A T R I X   ░
                                                        ░   T R A C E :  ░
                                                        ──────────────────

                                                        """);
                                                    System.out.println(">> tr = " + resultTrace);
                                                    pause();

                                                    System.out.println("""

                                                    

                                                        █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                        ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                        """);
                                                    System.out.print(">> ");
                                                    String saveChoice = scanner.nextLine().toUpperCase();

                                                    if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                        System.out.print(">> Save as: ");
                                                        String outputFileName = scanner.nextLine();

                                                        String traceToSave = "tr = " + resultTrace;
                                                        MatricesIO.SaveStringToFile(traceToSave, outputFileName);
                                                        System.out.println(">> Saved as " + outputFileName + "!\n");

                                                    } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                        System.out.println("Not saved.");

                                                    } else {
                                                        System.out.println("Invalid.");
                                                    }

                                                    pause();
                                                    cls();

                                                } else {
                                                    System.out.println("Invalid: Matriks harus merupakan matriks persegi untuk menghitung trace.");
                                                }
                                            } else {
                                                System.out.println("Invalid: Matriks harus merupakan matriks persegi untuk menghitung trace.");
                                                pause();
                                                cls();
                                            }

                                            break;
                                        
                                        case "3":
                                        case "BACK":
                                            traceInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");

                                    }
                                }
                                break;                             

                            case "4":
                            case "*":
                            case "MULTIPLY MATRICES":
                                boolean multiplyMenu = true;
                                while (multiplyMenu) {
                                    System.out.println("""
                                        
                                        █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▄█
                                        █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ░█░

                                        █▀▄▀█ ▄▀█ ▀█▀ █▀█ █ █▀▀ █▀▀ █▀
                                        █░▀░█ █▀█ ░█░ █▀▄ █ █▄▄ ██▄ ▄█


                                        ░ 1. Multiply Matrices
                                        ░ 2. Multiply Matrices by Constant
                                        ░ 3. Multiply Matrices With Mod
                                        ░ 4. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String multiplyChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (multiplyChoice) {
                                        case "1":
                                        case "MULTIPLY MATRICES":
                                            boolean iMultiplyInput = true;
                                            while (iMultiplyInput) {
                                                System.out.println("""
                                                
                                                    █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▄█
                                                    █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ░█░


                                                    ░ Source of Input:
                                                    ───────────────────

                                                    ░ 1. Keyboard
                                                    ░ 2. File
                                                    ░ 3. Back
                                                    """);
                                                    System.out.print("░ >> Choose: ");
                                                    String iMultiplyInputChoice = scanner.nextLine().toUpperCase();

                                                    pause();
                                                    cls();

                                                    switch (iMultiplyInputChoice){
                                                        case "1":
                                                        case "KEYBOARD":
                                                            System.out.println("""
                                                            
                                                                █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▄█
                                                                █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ░█░

                                                            
                                                                """);
                                                            System.out.println("""
                                                                ─────────────────────
                                                                ░  M A T R I X  1 : ░
                                                                ─────────────────────
                                                                """);
                                                            double[][] matrixiD1 = ReadMatrices.Keyboard();
                                                            System.out.println("""
                                                                \n
                                                                ─────────────────────
                                                                ░  M A T R I X  2 : ░
                                                                ─────────────────────
                                                                """);
                                                            double[][] matrixiD2 = ReadMatrices.Keyboard();
                                                            
                                                            if (matrixiD1[0].length == matrixiD2.length) {
                                                                double[][] resultMultiply = Multiplies.MultiplyMatrix(matrixiD1, matrixiD2);
                                                                if (resultMultiply != null) {
                                                                    System.out.print("""
                                                                        \n
                                                                        ────────────────────────
                                                                        ░       H A S I L      ░
                                                                        ░  P E R K A L I A N : ░
                                                                        ────────────────────────
                                                                        """);
                                                                    PrintMatrices.Print(resultMultiply);

                                                                    pause();

                                                                    System.out.println("""

                                                                    

                                                                        █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                                        ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                                        """);
                                                                    System.out.print(">> ");
                                                                    String saveChoice = scanner.nextLine().toUpperCase();
                                                                    if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                                        System.out.print(">> Save as: ");
                                                                        String outputFileName = scanner.nextLine();
                                                                        MatricesIO.SaveMatrixToFile(resultMultiply, outputFileName);
                                                                        System.out.println(">> Saved as " + outputFileName + "!\n");
                                                                    } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                                        System.out.println("Not saved.");
                                                                    } else {
                                                                        System.out.println("Invalid.");
                                                                    }

                                                                    pause();
                                                                    cls();

                                                                } else {
                                                                    System.out.println("\n>> Jumlah kolom Matrix 1 tidak sama dengan jumlah baris Matrix 2.\n>> Perkalian tidak dapat dilakukan.");
                                                                }
                                                            } else {
                                                                System.out.println("\n>> Jumlah kolom Matrix 1 tidak sama dengan jumlah baris Matrix 2.\n>> Perkalian tidak dapat dilakukan.");
                                                                pause();
                                                                cls();
                                                            }

                                                            break;
                                                        
                                                        case "2":
                                                        case "FILE":
                                                            System.out.println("""
                                                            
                                                                █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▄█
                                                                █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ░█░

                                                            
                                                                """);
                                                            System.out.print("░ >> Matrix 1 file name: ");
                                                            String inputFileName1 = scanner.nextLine();
                                                            double[][] matrixiD3 = MatricesIO.FileToMatrix(inputFileName1);
                                                            System.out.print("░ >> Matrix 2 file name: ");
                                                            String inputFileName2 = scanner.nextLine();
                                                            double[][] matrixiD4 = MatricesIO.FileToMatrix(inputFileName2);

                                                            if (matrixiD3 != null && matrixiD4 != null){

                                                                System.out.println("""


                                                                    ─────────────────────
                                                                    ░  M A T R I X  1 : ░
                                                                    ─────────────────────""");
                                                                PrintMatrices.Print(matrixiD3);
                                                                System.out.println("""

                                                                    ─────────────────────
                                                                    ░  M A T R I X  2 : ░
                                                                    ─────────────────────""");
                                                                PrintMatrices.Print(matrixiD4);

                                                                if (matrixiD3[0].length == matrixiD4.length) {
                                                                    double[][] resultMultiply = Multiplies.MultiplyMatrix(matrixiD3, matrixiD4);
                                                                    if (resultMultiply != null) {
                                                                        System.out.print("""
                                                                            \n
                                                                            ────────────────────────
                                                                            ░       H A S I L      ░
                                                                            ░  P E R K A L I A N : ░
                                                                            ────────────────────────
                                                                            """);
                                                                        PrintMatrices.Print(resultMultiply);

                                                                        pause();

                                                                        System.out.println("""

                                                                        

                                                                            █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                                            ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                                            """);
                                                                        System.out.print(">> ");
                                                                        String saveChoice = scanner.nextLine().toUpperCase();
                                                                        if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                                            System.out.print(">> Save as: ");
                                                                            String outputFileName = scanner.nextLine();
                                                                            MatricesIO.SaveMatrixToFile(resultMultiply, outputFileName);
                                                                            System.out.println(">> Saved as " + outputFileName + "!\n");
                                                                        } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                                            System.out.println("Not saved.");
                                                                        } else {
                                                                            System.out.println("Invalid.");
                                                                        }

                                                                        pause();
                                                                        cls();

                                                                    } else {
                                                                        System.out.println("\n>> Jumlah kolom Matrix 1 tidak sama dengan jumlah baris Matrix 2.\n>> Perkalian tidak dapat dilakukan.");
                                                                    }
                                                                } else {
                                                                    System.out.println("\n>> Jumlah kolom Matrix 1 tidak sama dengan jumlah baris Matrix 2.\n>> Perkalian tidak dapat dilakukan.");
                                                                    pause();
                                                                    cls();
                                                                }
                                                            }
                                                                break;

                                                        case "3":
                                                        case "BACK":
                                                            iMultiplyInput = false;
                                                            break;
                                                }
                                            }
                                            break;

                                        case "2":
                                        case "MULTIPLY MATRICES BY CONSTANT":
                                            boolean iiMultiplyInput = true;
                                            while (iiMultiplyInput) {
                                                System.out.println("""
                                                
                                                    █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▄█
                                                    █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ░█░
                                                    
                                                    █▄▄ █▄█   █▀▀ █▀█ █▄░█ █▀ ▀█▀ ▄▀█ █▄░█ ▀█▀
                                                    █▄█ ░█░   █▄▄ █▄█ █░▀█ ▄█ ░█░ █▀█ █░▀█ ░█░


                                                    ░ Source of Input:
                                                    ───────────────────

                                                    ░ 1. Keyboard
                                                    ░ 2. File
                                                    ░ 3. Back
                                                    """);
                                                System.out.print("░ >> Choose: ");
                                                String iiMultiplyInputChoice = scanner.nextLine().toUpperCase();

                                                pause();
                                                cls();

                                                switch (iiMultiplyInputChoice){
                                                    case "1":
                                                    case "KEYBOARD":
                                                        System.out.println("""
                                                        
                                                            █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▄█
                                                            █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ░█░
                                                            
                                                            █▄▄ █▄█   █▀▀ █▀█ █▄░█ █▀ ▀█▀ ▄▀█ █▄░█ ▀█▀
                                                            █▄█ ░█░   █▄▄ █▄█ █░▀█ ▄█ ░█░ █▀█ █░▀█ ░█░


                                                            """);
                                                        System.out.println("""
                                                            ───────────────────
                                                            ░  M A T R I X  : ░
                                                            ───────────────────
                                                            """);
                                                        double[][] matrixiiD1 = ReadMatrices.Keyboard();

                                                        System.out.print("""

                                                            ───────────────────────
                                                            ░  C O N S T A N T  : ░
                                                            ───────────────────────\n""");
                                                        double constant = scanner.nextDouble();
                                                        scanner.nextLine();
                                                        
                                                        double[][] resultMultiplyMatrixByConstant = Multiplies.MultiplyMatrixByConstant(matrixiiD1, constant);

                                                        System.out.print("""
                                                            \n
                                                             ────────────────────────
                                                            ░       H A S I L      ░
                                                            ░  P E R K A L I A N : ░
                                                            ────────────────────────
                                                                """);
                                                        PrintMatrices.Print(resultMultiplyMatrixByConstant);

                                                        pause();

                                                        System.out.println("""
                                                                


                                                            █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                            ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                            """);
                                                        System.out.print(">> ");
                                                        String saveChoice = scanner.nextLine().toUpperCase();
                                                        if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                            System.out.print(">> Save as: ");
                                                            String outputFileName = scanner.nextLine();
                                                            MatricesIO.SaveMatrixToFile(resultMultiplyMatrixByConstant, outputFileName);
                                                            System.out.println(">> Saved as " + outputFileName + "!\n");
                                                        } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                            System.out.println("Not saved.");
                                                        } else {
                                                            System.out.println("Invalid.");
                                                        }

                                                        pause();
                                                        cls();

                                                        break;

                                                    case "2":
                                                    case "FILE":
                                                        System.out.println("""
                                                        
                                                            █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▄█
                                                            █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ░█░
                                                            
                                                            █▄▄ █▄█   █▀▀ █▀█ █▄░█ █▀ ▀█▀ ▄▀█ █▄░█ ▀█▀
                                                            █▄█ ░█░   █▄▄ █▄█ █░▀█ ▄█ ░█░ █▀█ █░▀█ ░█░

                                                            
                                                            """);
                                                        System.out.print("░ >> Matrix 1 file name: ");
                                                        String inputFileName1 = scanner.nextLine();
                                                        double[][] matrixiiD2 = MatricesIO.FileToMatrix(inputFileName1);

                                                        if(matrixiiD2 != null){
                                                            System.out.println("""


                                                                ─────────────────────
                                                                ░  M A T R I X  1 : ░
                                                                ─────────────────────""");
                                                            PrintMatrices.Print(matrixiiD2);
                                                            System.out.print("""

                                                                ───────────────────────
                                                                ░  C O N S T A N T  : ░
                                                                ───────────────────────\n""");
                                                            double constantF = scanner.nextDouble();
                                                            scanner.nextLine();
                                                            
                                                            double[][] resultMultiplyMatrixByConstantF = Multiplies.MultiplyMatrixByConstant(matrixiiD2, constantF);

                                                            System.out.print("""
                                                                \n
                                                                ────────────────────────
                                                                ░       H A S I L      ░
                                                                ░  P E R K A L I A N : ░
                                                                ────────────────────────
                                                                    """);
                                                            PrintMatrices.Print(resultMultiplyMatrixByConstantF);

                                                            pause();

                                                            System.out.println("""
                                                                    


                                                                █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                                ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                                """);
                                                            System.out.print(">> ");
                                                            String saveChoiceF = scanner.nextLine().toUpperCase();
                                                            if (saveChoiceF.equals("Y") || saveChoiceF.equals("YAY")) {
                                                                System.out.print(">> Save as: ");
                                                                String outputFileName = scanner.nextLine();
                                                                MatricesIO.SaveMatrixToFile(resultMultiplyMatrixByConstantF, outputFileName);
                                                                System.out.println(">> Saved as " + outputFileName + "!\n");
                                                            } else if (saveChoiceF.equals("N") || saveChoiceF.equals("NAY")){
                                                                System.out.println("Not saved.");
                                                            } else {
                                                                System.out.println("Invalid.");
                                                            }

                                                            pause();
                                                            cls();

                                                            break;
                                                        }

                                                    case "3":
                                                    case "BACK":
                                                        iiMultiplyInput = false;
                                                        break;
                                                }
                                            }
                                            break;

                                        case "3":
                                        case "MULTIPLY MATRIX WITH MOD":
                                            boolean iiiMultiplyInput = true;
                                            while (iiiMultiplyInput) {
                                                System.out.println("""
                                                
                                                    █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▄█
                                                    █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ░█░
                                                   
                                                    █░█░█ █ ▀█▀ █░█   █▀▄▀█ █▀█ █▀▄
                                                    ▀▄▀▄▀ █ ░█░ █▀█   █░▀░█ █▄█ █▄▀


                                                    ░ Source of Input:
                                                    ───────────────────

                                                    ░ 1. Keyboard
                                                    ░ 2. File
                                                    ░ 3. Back
                                                    """);

                                                System.out.print("░ >> Choose: ");
                                                String iiiMultiplyInputChoice = scanner.nextLine().toUpperCase();

                                                pause();
                                                cls();

                                                switch (iiiMultiplyInputChoice){
                                                    case "1":
                                                    case "KEYBOARD":
                                                        System.out.println("""
                                                        
                                                            █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▄█
                                                            █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ░█░
                                                        
                                                            █░█░█ █ ▀█▀ █░█   █▀▄▀█ █▀█ █▀▄
                                                            ▀▄▀▄▀ █ ░█░ █▀█   █░▀░█ █▄█ █▄▀


                                                            """);
                                                            System.out.println("""
                                                                ─────────────────────
                                                                ░  M A T R I X  1 : ░
                                                                ─────────────────────
                                                                """);
                                                            double[][] matrixiiiD1 = ReadMatrices.Keyboard();
                                                            System.out.println("""
                                                                \n
                                                                ─────────────────────
                                                                ░  M A T R I X  2 : ░
                                                                ─────────────────────
                                                                """);
                                                            double[][] matrixiiiD2 = ReadMatrices.Keyboard();

                                                            double[][] resultMultiplyMatrixii = Multiplies.MultiplyMatrix(matrixiiiD1, matrixiiiD2);
                                                            if (resultMultiplyMatrixii != null) {
                                                                System.out.print("""
                                                                    \n
                                                                    ────────────────────────
                                                                    ░       H A S I L      ░
                                                                    ░  P E R K A L I A N : ░
                                                                    ────────────────────────
                                                                    """);
                                                            PrintMatrices.Print(resultMultiplyMatrixii);

                                                            System.out.println("""
                                                                \n
                                                                ───────────────────────
                                                                ░  M O D  V A L U E : ░
                                                                ───────────────────────
                                                                """);

                                                            double mod = scanner.nextDouble();
                                                            scanner.nextLine();
                                                            
                                                            if (matrixiiiD1[0].length == matrixiiiD2.length) {
                                                                double[][] resultMultiplyMatrixWithMod = Multiplies.MultiplyMatrixWithMod(matrixiiiD1, matrixiiiD2, mod);
                                                                if (resultMultiplyMatrixWithMod != null) {
                                                                    System.out.print("""
                                                                        \n
                                                                        ─────────────────────────
                                                                        ░        H A S I L      ░
                                                                        ░   P E R K A L I A N   ░
                                                                        ░  D E N G A N  M O D : ░
                                                                        ─────────────────────────
                                                                        """);
                                                                    PrintMatrices.Print(resultMultiplyMatrixWithMod);

                                                                    pause();

                                                                    System.out.println("""

                                                                    

                                                                        █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                                        ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                                        """);
                                                                    System.out.print(">> ");
                                                                    String saveChoice = scanner.nextLine().toUpperCase();
                                                                    if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                                        System.out.print(">> Save as: ");
                                                                        String outputFileName = scanner.nextLine();
                                                                        MatricesIO.SaveMatrixToFile(resultMultiplyMatrixWithMod, outputFileName);
                                                                        System.out.println(">> Saved as " + outputFileName + "!\n");
                                                                    } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                                        System.out.println("Not saved.");
                                                                    } else {
                                                                        System.out.println("Invalid.");
                                                                    }

                                                                    pause();
                                                                    cls();

                                                                } else {
                                                                    System.out.println("\n>> Jumlah kolom Matrix 1 tidak sama dengan jumlah baris Matrix 2.\n>> Perkalian tidak dapat dilakukan.");
                                                                }
                                                            } else {
                                                                System.out.println("\n>> Jumlah kolom Matrix 1 tidak sama dengan jumlah baris Matrix 2.\n>> Perkalian tidak dapat dilakukan.");
                                                                pause();
                                                                cls();
                                                            }
                                                        }

                                                            break;

                                                    case "2":
                                                    case "FILE":
                                                        System.out.println("""
                                                        
                                                            █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▄█
                                                            █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ░█░
                                                        
                                                            █░█░█ █ ▀█▀ █░█   █▀▄▀█ █▀█ █▀▄
                                                            ▀▄▀▄▀ █ ░█░ █▀█   █░▀░█ █▄█ █▄▀


                                                            """);
                                                            System.out.print("░ >> Matrix 1 file name: ");
                                                            String inputFileName1 = scanner.nextLine();
                                                            double[][] matrixiiiD3 = MatricesIO.FileToMatrix(inputFileName1);
                                                            System.out.print("░ >> Matrix 2 file name: ");
                                                            String inputFileName2 = scanner.nextLine();
                                                            double[][] matrixiiiD4 = MatricesIO.FileToMatrix(inputFileName2);

                                                            if (matrixiiiD3 != null && matrixiiiD4 != null){

                                                                System.out.println("""


                                                                    ─────────────────────
                                                                    ░  M A T R I X  1 : ░
                                                                    ─────────────────────""");
                                                                PrintMatrices.Print(matrixiiiD3);
                                                                System.out.println("""

                                                                    ─────────────────────
                                                                    ░  M A T R I X  2 : ░
                                                                    ─────────────────────""");
                                                                PrintMatrices.Print(matrixiiiD4);
                                                                double[][] resultMultiplyMatrixiii = Multiplies.MultiplyMatrix(matrixiiiD3, matrixiiiD4);
                                                                if (resultMultiplyMatrixiii != null) {
                                                                    System.out.print("""
                                                                        \n
                                                                        ────────────────────────
                                                                        ░       H A S I L      ░
                                                                        ░  P E R K A L I A N : ░
                                                                        ────────────────────────
                                                                        """);
                                                                    PrintMatrices.Print(resultMultiplyMatrixiii);
                                                                if (matrixiiiD3[0].length == matrixiiiD4.length) {
                                                                    System.out.println("""
                                                                        \n
                                                                        ───────────────────────
                                                                        ░  M O D  V A L U E : ░
                                                                        ───────────────────────
                                                                        """);

                                                                    double modF = scanner.nextDouble();
                                                                    double[][] resultMultiplyMatrixWithModF = Multiplies.MultiplyMatrixWithMod(matrixiiiD3, matrixiiiD4, modF);
                                                                    scanner.nextLine();

                                                                    if (resultMultiplyMatrixWithModF != null) {
                                                                        System.out.print("""
                                                                            \n
                                                                            ─────────────────────────
                                                                            ░        H A S I L      ░
                                                                            ░   P E R K A L I A N   ░
                                                                            ░  D E N G A N  M O D : ░
                                                                            ─────────────────────────
                                                                            """);
                                                                        PrintMatrices.Print(resultMultiplyMatrixWithModF);

                                                                        pause();

                                                                        System.out.println("""

                                                                        

                                                                            █▀ ▄▀█ █░█ █▀▀  ▀█   ▄▀ █▄█ ▄▀█ █▄█   ░░▄▀   █▄░█ ▄▀█ █▄█ ▀▄
                                                                            ▄█ █▀█ ▀▄▀ ██▄  ░▄   ▀▄ ░█░ █▀█ ░█░   ▄▀░░   █░▀█ █▀█ ░█░ ▄▀
                                                                            """);
                                                                        System.out.print(">> ");
                                                                        String saveChoice = scanner.nextLine().toUpperCase();
                                                                        if (saveChoice.equals("Y") || saveChoice.equals("YAY")) {
                                                                            System.out.print(">> Save as: ");
                                                                            String outputFileName = scanner.nextLine();
                                                                            MatricesIO.SaveMatrixToFile(resultMultiplyMatrixWithModF, outputFileName);
                                                                            System.out.println(">> Saved as " + outputFileName + "!\n");
                                                                        } else if (saveChoice.equals("N") || saveChoice.equals("NAY")){
                                                                            System.out.println("Not saved.");
                                                                        } else {
                                                                            System.out.println("Invalid.");
                                                                        }

                                                                        pause();
                                                                        cls();

                                                                    } else {
                                                                        System.out.println("\n>> Jumlah kolom Matrix 1 tidak sama dengan jumlah baris Matrix 2.\n>> Perkalian tidak dapat dilakukan.");
                                                                    }
                                                                } else {
                                                                    System.out.println("\n>> Jumlah kolom Matrix 1 tidak sama dengan jumlah baris Matrix 2.\n>> Perkalian tidak dapat dilakukan.");
                                                                    pause();
                                                                    cls();
                                                                }
                                                            }
                                                        }
                                                                break;

                                                    case "3":
                                                    case "BACK":
                                                        iiiMultiplyInput = false;
                                                        break;
                                                }
                                            }
                                            break;


                                        case "4":
                                        case "BACK":
                                            multiplyMenu = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;

                            case "5":
                            case "T":
                            case "TRANSPOSE":
                                boolean transposeInput = true;
                                while(transposeInput) {
                                    System.out.println("""

                                        ▀█▀ █▀█ ▄▀█ █▄░█ █▀ █▀█ █▀█ █▀ █▀▀
                                        ░█░ █▀▄ █▀█ █░▀█ ▄█ █▀▀ █▄█ ▄█ ██▄

                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);
                                    System.out.print("░ >> Choose: ");
                                    String transposeInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (transposeInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                ▀█▀ █▀█ ▄▀█ █▄░█ █▀ █▀█ █▀█ █▀ █▀▀
                                                ░█░ █▀▄ █▀█ █░▀█ ▄█ █▀▀ █▄█ ▄█ ██▄


                                                """);
                                            System.out.println("""
                                                ──────────────────
                                                ░  M A T R I X : ░
                                                ──────────────────
                                                """);
                                            double[][] matrixE = ReadMatrices.Keyboard();
        

                                            break;
                                        case "2":
                                        case "FILE":
                                            break;
                                        case "3":
                                        case "BACK":
                                            transposeInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;

                            case "6":
                            case "ROW ECHELON":
                                operationsMenu = false;
                                break;

                            case "7":
                            case "REDUCED ROW ECHELON":
                                operationsMenu = false;
                                break;

                            case "8":
                            case "BACK":
                                operationsMenu = false;
                                break;

                            default:
                                System.out.println("Invalid.");
                        }
                    }
                    break;

                case "2":
                case "SYSTEM OF LINEAR EQUATIONS":
                    // SPL
                    boolean splMenu = true;
                    while (splMenu) {
                        System.out.println("""
                        
                            █▀ █▄█ █▀ ▀█▀ █▀▀ █▀▄▀█   █▀█ █▀▀
                            ▄█ ░█░ ▄█ ░█░ ██▄ █░▀░█   █▄█ █▀░

                            █░░ █ █▄░█ █▀▀ ▄▀█ █▀█
                            █▄▄ █ █░▀█ ██▄ █▀█ █▀▄

                            █▀▀ █▀█ █░█ ▄▀█ ▀█▀ █ █▀█ █▄░█ █▀
                            ██▄ ▀▀█ █▄█ █▀█ ░█░ █ █▄█ █░▀█ ▄█


                            ░ 1. Gauss Elimination Method
                            ░ 2. Gauss-Jordan Elimination Method
                            ░ 3. Inverse Matrices Method
                            ░ 4. Cramer Method
                            ░ 5. Back
                            """);
                        
                        System.out.print("░ >> Choose: ");
                        String splChoice = scanner.nextLine().toUpperCase();

                        pause();
                        cls();
    
                        switch (splChoice) {
                            case "1":
                            case "GAUSS ELIMINATION METHOD":
                                boolean splGaussInput = true;
                                while (splGaussInput) {
                                    System.out.println("""

                                        █▀▀ ▄▀█ █░█ █▀ █▀
                                        █▄█ █▀█ █▄█ ▄█ ▄█
                                        
                                        █▀▀ █░░ █ █▀▄▀█ █ █▄░█ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                        ██▄ █▄▄ █ █░▀░█ █ █░▀█ █▀█ ░█░ █ █▄█ █░▀█


                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String splGaussInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (splGaussInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                █▀▀ ▄▀█ █░█ █▀ █▀
                                                █▄█ █▀█ █▄█ ▄█ ▄█
                                                
                                                █▀▀ █░░ █ █▀▄▀█ █ █▄░█ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                                ██▄ █▄▄ █ █░▀░█ █ █░▀█ █▀█ ░█░ █ █▄█ █░▀█


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                █▀▀ ▄▀█ █░█ █▀ █▀
                                                █▄█ █▀█ █▄█ ▄█ ▄█
                                                
                                                █▀▀ █░░ █ █▀▄▀█ █ █▄░█ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                                ██▄ █▄▄ █ █░▀░█ █ █░▀█ █▀█ ░█░ █ █▄█ █░▀█


                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            splGaussInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;
    
                            case "2":
                            case "GAUSS-JORDAN ELIMINATION METHOD":
                                boolean splGaussJordanInput = true;
                                while (splGaussJordanInput) {
                                    System.out.println("""

                                        █▀▀ ▄▀█ █░█ █▀ █▀ ▄▄ ░░█ █▀█ █▀█ █▀▄ ▄▀█ █▄░█
                                        █▄█ █▀█ █▄█ ▄█ ▄█ ░░ █▄█ █▄█ █▀▄ █▄▀ █▀█ █░▀█
                                        
                                        █▀▀ █░░ █ █▀▄▀█ █ █▄░█ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                        ██▄ █▄▄ █ █░▀░█ █ █░▀█ █▀█ ░█░ █ █▄█ █░▀█

                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String splGaussJordanInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (splGaussJordanInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                █▀▀ ▄▀█ █░█ █▀ █▀ ▄▄ ░░█ █▀█ █▀█ █▀▄ ▄▀█ █▄░█
                                                █▄█ █▀█ █▄█ ▄█ ▄█ ░░ █▄█ █▄█ █▀▄ █▄▀ █▀█ █░▀█
                                                
                                                █▀▀ █░░ █ █▀▄▀█ █ █▄░█ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                                ██▄ █▄▄ █ █░▀░█ █ █░▀█ █▀█ ░█░ █ █▄█ █░▀█


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                █▀▀ ▄▀█ █░█ █▀ █▀ ▄▄ ░░█ █▀█ █▀█ █▀▄ ▄▀█ █▄░█
                                                █▄█ █▀█ █▄█ ▄█ ▄█ ░░ █▄█ █▄█ █▀▄ █▄▀ █▀█ █░▀█
                                                
                                                █▀▀ █░░ █ █▀▄▀█ █ █▄░█ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                                ██▄ █▄▄ █ █░▀░█ █ █░▀█ █▀█ ░█░ █ █▄█ █░▀█


                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            splGaussJordanInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;
    
                            case "3":
                            case "INVERSE MATRICES METHOD":
                                boolean splInverseInput = true;
                                while (splInverseInput) {
                                    System.out.println("""

                                        █ █▄░█ █░█ █▀▀ █▀█ █▀ █▀▀   █▀▄▀█ ▄▀█ ▀█▀ █▀█ █ █▀▀ █▀▀ █▀
                                        █ █░▀█ ▀▄▀ ██▄ █▀▄ ▄█ ██▄   █░▀░█ █▀█ ░█░ █▀▄ █ █▄▄ ██▄ ▄█ 

                                        █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                        █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀

                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String splInverseInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (splInverseInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                █ █▄░█ █░█ █▀▀ █▀█ █▀ █▀▀   █▀▄▀█ ▄▀█ ▀█▀ █▀█ █ █▀▀ █▀▀ █▀
                                                █ █░▀█ ▀▄▀ ██▄ █▀▄ ▄█ ██▄   █░▀░█ █▀█ ░█░ █▀▄ █ █▄▄ ██▄ ▄█ 

                                                █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                                █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                █ █▄░█ █░█ █▀▀ █▀█ █▀ █▀▀   █▀▄▀█ ▄▀█ ▀█▀ █▀█ █ █▀▀ █▀▀ █▀
                                                █ █░▀█ ▀▄▀ ██▄ █▀▄ ▄█ ██▄   █░▀░█ █▀█ ░█░ █▀▄ █ █▄▄ ██▄ ▄█ 

                                                █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                                █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            splInverseInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;
    
                            case "4":
                            case "CRAMER METHOD":
                                boolean splCramerInput = true;
                                while (splCramerInput) {
                                    System.out.println("""

                                        █▀▀ █▀█ ▄▀█ █▀▄▀█ █▀▀ █▀█   █▀█ █░█ █░░ █▀▀
                                        █▄▄ █▀▄ █▀█ █░▀░█ ██▄ █▀▄   █▀▄ █▄█ █▄▄ ██▄

                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String splCramerInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (splCramerInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                █▀▀ █▀█ ▄▀█ █▀▄▀█ █▀▀ █▀█   █▀█ █░█ █░░ █▀▀
                                                █▄▄ █▀▄ █▀█ █░▀░█ ██▄ █▀▄   █▀▄ █▄█ █▄▄ ██▄


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                █▀▀ █▀█ ▄▀█ █▀▄▀█ █▀▀ █▀█   █▀█ █░█ █░░ █▀▀
                                                █▄▄ █▀▄ █▀█ █░▀░█ ██▄ █▀▄   █▀▄ █▄█ █▄▄ ██▄


                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            splCramerInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;
                            
                            case "5":
                            case "BACK":
                                splMenu = false;
                                break;
                            
                            default:
                                System.out.println("Invalid.");
                        }
                    }
                    break;

                case "3":
                case "MATRICES DETERMINANT":
                    boolean determinantMenu = true;
                    while (determinantMenu) {
                        System.out.println("""

                            █▀▄ █▀▀ ▀█▀ █▀▀ █▀█ █▀▄▀█ █ █▄░█ ▄▀█ █▄░█ ▀█▀
                            █▄▀ ██▄ ░█░ ██▄ █▀▄ █░▀░█ █ █░▀█ █▀█ █░▀█ ░█░

                            ░ 1. Cofactor Expansion Method
                            ░ 2. Reduced Row Method
                            ░ 3. Back
                            """);
                        
                        System.out.print("░ >> Choose: ");
                        String determinantChoice = scanner.nextLine().toUpperCase();

                        pause();
                        cls();

                        switch (determinantChoice) {
                            case "1":
                            case "COFACTOR EXPANSION METHOD":
                                boolean determinantCEInput = true;
                                while (determinantCEInput){
                                    System.out.println("""


                                        █▀▀ █▀█ █▀▀ ▄▀█ █▀▀ ▀█▀ █▀█ █▀█   █▀▀ ▀▄▀ █▀█ ▄▀█ █▄░█ █▀ █ █▀█ █▄░█
                                        █▄▄ █▄█ █▀░ █▀█ █▄▄ ░█░ █▄█ █▀▄   ██▄ █░█ █▀▀ █▀█ █░▀█ ▄█ █ █▄█ █░▀█
                                        
                                        █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                        █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀

                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String determinantCEInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (determinantCEInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                █▀▀ █▀█ █▀▀ ▄▀█ █▀▀ ▀█▀ █▀█ █▀█   █▀▀ ▀▄▀ █▀█ ▄▀█ █▄░█ █▀ █ █▀█ █▄░█
                                                █▄▄ █▄█ █▀░ █▀█ █▄▄ ░█░ █▄█ █▀▄   ██▄ █░█ █▀▀ █▀█ █░▀█ ▄█ █ █▄█ █░▀█
                                                
                                                █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                                █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                █▀▀ █▀█ █▀▀ ▄▀█ █▀▀ ▀█▀ █▀█ █▀█   █▀▀ ▀▄▀ █▀█ ▄▀█ █▄░█ █▀ █ █▀█ █▄░█
                                                █▄▄ █▄█ █▀░ █▀█ █▄▄ ░█░ █▄█ █▀▄   ██▄ █░█ █▀▀ █▀█ █░▀█ ▄█ █ █▄█ █░▀█
                                                
                                                █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                                █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            determinantCEInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;

                            case "2":
                            case "REDUCED ROW METHOD":
                                boolean determinantRRInput = true;
                                while (determinantRRInput){
                                    System.out.println("""

                                        █▀█ █▀▀ █▀▄ █░█ █▀▀ █▀▀ █▀▄   █▀█ █▀█ █░█░█
                                        █▀▄ ██▄ █▄▀ █▄█ █▄▄ ██▄ █▄▀   █▀▄ █▄█ ▀▄▀▄▀
                                        
                                        █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                        █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀

                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String determinantRRInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (determinantRRInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                █▀█ █▀▀ █▀▄ █░█ █▀▀ █▀▀ █▀▄   █▀█ █▀█ █░█░█
                                                █▀▄ ██▄ █▄▀ █▄█ █▄▄ ██▄ █▄▀   █▀▄ █▄█ ▀▄▀▄▀
                                                
                                                █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                                █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                

                                                █▀█ █▀▀ █▀▄ █░█ █▀▀ █▀▀ █▀▄   █▀█ █▀█ █░█░█
                                                █▀▄ ██▄ █▄▀ █▄█ █▄▄ ██▄ █▄▀   █▀▄ █▄█ ▀▄▀▄▀
                                                
                                                █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                                █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            determinantRRInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;
                            
                            case "3":
                            case "BACK":
                                determinantMenu = false;
                                break;
                            
                            default:
                                System.out.println("Invalid.");
                        }
                    }
                    break;
                    
                case "4":
                case "MATRICES INVERSE":
                    boolean inverseMenu = true;
                    while (inverseMenu) {
                        System.out.println("""

                            █▀▄▀█ ▄▀█ ▀█▀ █▀█ █ █▀▀ █▀▀ █▀
                            █░▀░█ █▀█ ░█░ █▀▄ █ █▄▄ ██▄ ▄█
                            
                            █ █▄░█ █░█ █▀▀ █▀█ █▀ █▀▀
                            █ █░▀█ ▀▄▀ ██▄ █▀▄ ▄█ ██▄


                            ░ 1. Inverse Matrices Method
                            ░ 2. Adjoint Method
                            ░ 3. Back
                            """);
                        
                        System.out.print("░ >> Choose: ");
                        String inverseChoice = scanner.nextLine().toUpperCase();

                        pause();
                        cls();

                        switch (inverseChoice) {
                            case "1":
                            case "INVERSE MATRICES METHOD":
                                boolean inverseIMInput = true;
                                while (inverseIMInput){
                                    System.out.println("""

                                        █ █▄░█ █░█ █▀▀ █▀█ █▀ █▀▀   █▀▄▀█ ▄▀█ ▀█▀ █▀█ █ █▀▀ █▀▀ █▀
                                        █ █░▀█ ▀▄▀ ██▄ █▀▄ ▄█ ██▄   █░▀░█ █▀█ ░█░ █▀▄ █ █▄▄ ██▄ ▄█

                                        █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                        █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String inverseIMInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (inverseIMInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""

                                                █ █▄░█ █░█ █▀▀ █▀█ █▀ █▀▀   █▀▄▀█ ▄▀█ ▀█▀ █▀█ █ █▀▀ █▀▀ █▀
                                                █ █░▀█ ▀▄▀ ██▄ █▀▄ ▄█ ██▄   █░▀░█ █▀█ ░█░ █▀▄ █ █▄▄ ██▄ ▄█

                                                █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                                █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""

                                                █ █▄░█ █░█ █▀▀ █▀█ █▀ █▀▀   █▀▄▀█ ▄▀█ ▀█▀ █▀█ █ █▀▀ █▀▀ █▀
                                                █ █░▀█ ▀▄▀ ██▄ █▀▄ ▄█ ██▄   █░▀░█ █▀█ ░█░ █▀▄ █ █▄▄ ██▄ ▄█

                                                █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                                █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀

                                                
                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            inverseIMInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;

                            case "2":
                            case "ADJOINT METHOD":
                                boolean inverseAMInput = true;
                                while (inverseAMInput){
                                    System.out.println("""

                                        ▄▀█ █▀▄ ░░█ █▀█ █ █▄░█ ▀█▀
                                        █▀█ █▄▀ █▄█ █▄█ █ █░▀█ ░█░
                                        
                                        █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                        █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String inverseAMInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (inverseAMInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""

                                                ▄▀█ █▀▄ ░░█ █▀█ █ █▄░█ ▀█▀
                                                █▀█ █▄▀ █▄█ █▄█ █ █░▀█ ░█░

                                                █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                                █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""

                                                ▄▀█ █▀▄ ░░█ █▀█ █ █▄░█ ▀█▀
                                                █▀█ █▄▀ █▄█ █▄█ █ █░▀█ ░█░

                                                █▀▄▀█ █▀▀ ▀█▀ █░█ █▀█ █▀▄
                                                █░▀░█ ██▄ ░█░ █▀█ █▄█ █▄▀


                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            inverseAMInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;
                            
                            case "3":
                            case "BACK":
                                inverseMenu = false;
                                break;
                            
                            default:
                                System.out.println("Tidak valid.");
                        }
                    }
                    break;

                case "5":
                case "POLYNOMIAL INTERPOLATION":
                    boolean polynomialInterpolationMenu = true;
                    while (polynomialInterpolationMenu) {
                        System.out.println("""

                            █▀█ █▀█ █░░ █▄█ █▄░█ █▀█ █▀▄▀█ █ ▄▀█ █░░
                            █▀▀ █▄█ █▄▄ ░█░ █░▀█ █▄█ █░▀░█ █ █▀█ █▄▄
                            
                            █ █▄░█ ▀█▀ █▀▀ █▀█ █▀█ █▀█ █░░ ▄▀█ ▀█▀ █ █▀█ █▄░█
                            █ █░▀█ ░█░ ██▄ █▀▄ █▀▀ █▄█ █▄▄ █▀█ ░█░ █ █▄█ █░▀█

                            ░ 1. Polynomial Interpolation
                            ░ 2. Back
                            """);

                        System.out.print("░ >> Choose: ");
                        String polynomialInterpolationChoice = scanner.nextLine().toUpperCase();

                        pause();
                        cls();

                        switch (polynomialInterpolationChoice) {
                            case "1":
                            case "POLYNOMIAL INTERPOLATION":
                                boolean polynomialInterpolationInput = true;
                                while (polynomialInterpolationInput) {

                                    System.out.println("""


                                        █▀█ █▀█ █░░ █▄█ █▄░█ █▀█ █▀▄▀█ █ ▄▀█ █░░
                                        █▀▀ █▄█ █▄▄ ░█░ █░▀█ █▄█ █░▀░█ █ █▀█ █▄▄
                                        
                                        █ █▄░█ ▀█▀ █▀▀ █▀█ █▀█ █▀█ █░░ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                        █ █░▀█ ░█░ ██▄ █▀▄ █▀▀ █▄█ █▄▄ █▀█ ░█░ █ █▄█ █░▀█

                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String polynomialInterpolationInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (polynomialInterpolationInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                █▀█ █▀█ █░░ █▄█ █▄░█ █▀█ █▀▄▀█ █ ▄▀█ █░░
                                                █▀▀ █▄█ █▄▄ ░█░ █░▀█ █▄█ █░▀░█ █ █▀█ █▄▄
                                                
                                                █ █▄░█ ▀█▀ █▀▀ █▀█ █▀█ █▀█ █░░ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                                █ █░▀█ ░█░ ██▄ █▀▄ █▀▀ █▄█ █▄▄ █▀█ ░█░ █ █▄█ █░▀█


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                █▀█ █▀█ █░░ █▄█ █▄░█ █▀█ █▀▄▀█ █ ▄▀█ █░░
                                                █▀▀ █▄█ █▄▄ ░█░ █░▀█ █▄█ █░▀░█ █ █▀█ █▄▄
                                                
                                                █ █▄░█ ▀█▀ █▀▀ █▀█ █▀█ █▀█ █░░ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                                █ █░▀█ ░█░ ██▄ █▀▄ █▀▀ █▄█ █▄▄ █▀█ ░█░ █ █▄█ █░▀█


                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            polynomialInterpolationInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;

                            case "2":
                            case "BACK":
                                polynomialInterpolationMenu = false;
                                break;

                            default:
                                System.out.println("Invalid.");
                        }

                    }
                    break;

                case "6":
                case "BICUBIC SPLINE INTERPOLATION":
                    boolean bicubicSplineInterpolationMenu = true;
                    while (bicubicSplineInterpolationMenu) {
                        System.out.println("""

                            █▄▄ █ █▀▀ █░█ █▄▄ █ █▀▀   █▀ █▀█ █░░ █ █▄░█ █▀▀
                            █▄█ █ █▄▄ █▄█ █▄█ █ █▄▄   ▄█ █▀▀ █▄▄ █ █░▀█ ██▄
                            
                            █ █▄░█ ▀█▀ █▀▀ █▀█ █▀█ █▀█ █░░ ▄▀█ ▀█▀ █ █▀█ █▄░█
                            █ █░▀█ ░█░ ██▄ █▀▄ █▀▀ █▄█ █▄▄ █▀█ ░█░ █ █▄█ █░▀█

                            ░ 1. Bicubic Spline Interpolation
                            ░ 2. Back
                            """);

                        System.out.print("░ >> Choose: ");
                        String bicubicSplineInterpolationChoice = scanner.nextLine().toUpperCase();

                        pause();
                        cls();

                        switch (bicubicSplineInterpolationChoice) {
                            case "1":
                            case "BICUBIC SPLINE INTERPOLATION":
                                boolean bicubicSplineInterpolationInput = true;
                                while (bicubicSplineInterpolationInput) {

                                    System.out.println("""


                                        █▄▄ █ █▀▀ █░█ █▄▄ █ █▀▀   █▀ █▀█ █░░ █ █▄░█ █▀▀
                                        █▄█ █ █▄▄ █▄█ █▄█ █ █▄▄   ▄█ █▀▀ █▄▄ █ █░▀█ ██▄
                                        
                                        █ █▄░█ ▀█▀ █▀▀ █▀█ █▀█ █▀█ █░░ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                        █ █░▀█ ░█░ ██▄ █▀▄ █▀▀ █▄█ █▄▄ █▀█ ░█░ █ █▄█ █░▀█

                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String bicubicSplineInterpolationInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (bicubicSplineInterpolationInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                █▄▄ █ █▀▀ █░█ █▄▄ █ █▀▀   █▀ █▀█ █░░ █ █▄░█ █▀▀
                                                █▄█ █ █▄▄ █▄█ █▄█ █ █▄▄   ▄█ █▀▀ █▄▄ █ █░▀█ ██▄
                                                
                                                █ █▄░█ ▀█▀ █▀▀ █▀█ █▀█ █▀█ █░░ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                                █ █░▀█ ░█░ ██▄ █▀▄ █▀▀ █▄█ █▄▄ █▀█ ░█░ █ █▄█ █░▀█


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                █▄▄ █ █▀▀ █░█ █▄▄ █ █▀▀   █▀ █▀█ █░░ █ █▄░█ █▀▀
                                                █▄█ █ █▄▄ █▄█ █▄█ █ █▄▄   ▄█ █▀▀ █▄▄ █ █░▀█ ██▄
                                                
                                                █ █▄░█ ▀█▀ █▀▀ █▀█ █▀█ █▀█ █░░ ▄▀█ ▀█▀ █ █▀█ █▄░█
                                                █ █░▀█ ░█░ ██▄ █▀▄ █▀▀ █▄█ █▄▄ █▀█ ░█░ █ █▄█ █░▀█


                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            bicubicSplineInterpolationInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;

                            case "2":
                            case "BACK":
                                bicubicSplineInterpolationMenu = false;
                                break;

                            default:
                                System.out.println("Invalid.");
                        }

                    }
                    break;

                case "7":
                case "MULTIPLE LINEAR REGRESSION":
                    boolean mlRegressionMenu = true;
                    while (mlRegressionMenu) {
                        System.out.println("""

                            █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▀▀   █░░ █ █▄░█ █▀▀ ▄▀█ █▀█
                            █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ██▄   █▄▄ █ █░▀█ ██▄ █▀█ █▀▄
                            
                            █▀█ █▀▀ █▀▀ █▀█ █▀▀ █▀ █▀ █ █▀█ █▄░█
                            █▀▄ ██▄ █▄█ █▀▄ ██▄ ▄█ ▄█ █ █▄█ █░▀█

                            ░ 1. Multiple Linear Regression
                            ░ 2. Back
                            """);

                        System.out.print("░ >> Choose: ");
                        String mlRegressionChoice = scanner.nextLine().toUpperCase();

                        pause();
                        cls();

                        switch (mlRegressionChoice) {
                            case "1":
                            case "MULTIPLE LINEAR REGRESSION":
                                boolean mlRegressionInput = true;
                                while (mlRegressionInput) {

                                    System.out.println("""


                                        █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▀▀   █░░ █ █▄░█ █▀▀ ▄▀█ █▀█
                                        █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ██▄   █▄▄ █ █░▀█ ██▄ █▀█ █▀▄
                                        
                                        █▀█ █▀▀ █▀▀ █▀█ █▀▀ █▀ █▀ █ █▀█ █▄░█
                                        █▀▄ ██▄ █▄█ █▀▄ ██▄ ▄█ ▄█ █ █▄█ █░▀█

                                        ░ Source of Input:
                                        ───────────────────

                                        ░ 1. Keyboard
                                        ░ 2. File
                                        ░ 3. Back
                                        """);

                                    System.out.print("░ >> Choose: ");
                                    String mlRegressionInputChoice = scanner.nextLine().toUpperCase();

                                    pause();
                                    cls();

                                    switch (mlRegressionInputChoice){
                                        case "1":
                                        case "KEYBOARD":
                                            System.out.println("""
                                                
                                                █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▀▀   █░░ █ █▄░█ █▀▀ ▄▀█ █▀█
                                                █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ██▄   █▄▄ █ █░▀█ ██▄ █▀█ █▀▄
                                                
                                                █▀█ █▀▀ █▀▀ █▀█ █▀▀ █▀ █▀ █ █▀█ █▄░█
                                                █▀▄ ██▄ █▄█ █▀▄ ██▄ ▄█ ▄█ █ █▄█ █░▀█


                                                """);
                                            break;

                                        case "2":
                                        case "FILE":
                                            System.out.println("""
                                                
                                                █▀▄▀█ █░█ █░░ ▀█▀ █ █▀█ █░░ █▀▀   █░░ █ █▄░█ █▀▀ ▄▀█ █▀█
                                                █░▀░█ █▄█ █▄▄ ░█░ █ █▀▀ █▄▄ ██▄   █▄▄ █ █░▀█ ██▄ █▀█ █▀▄
                                                
                                                █▀█ █▀▀ █▀▀ █▀█ █▀▀ █▀ █▀ █ █▀█ █▄░█
                                                █▀▄ ██▄ █▄█ █▀▄ ██▄ ▄█ ▄█ █ █▄█ █░▀█


                                                """);
                                            break;

                                        case "3":
                                        case "BACK":
                                            mlRegressionInput = false;
                                            break;

                                        default:
                                            System.out.println("Invalid.");
                                    }
                                }
                                break;

                            case "2":
                            case "BACK":
                                mlRegressionMenu = false;
                                break;

                            default:
                                System.out.println("Invalid.");
                        }

                    }
                    break;
                
                case "8":
                case "HELP":
                    boolean helpMenu = true;
                    while (helpMenu) {
                        System.out.println("""

                            █░█ █▀▀ █░░ █▀█
                            █▀█ ██▄ █▄▄ █▀▀


                            ░ 1. Cara menginput elemen matriks
                            ░ 2. Back
                            """);
                        
                        System.out.print("░ >> Choose: ");
                        String helpChoice = scanner.nextLine().toUpperCase();

                        pause();
                        cls();

                        switch (helpChoice) {
                            case "1":
                            case "CARA MENGINPUT ELEMEN MATRIKS":
                                System.out.println("""
                                    ─────────────────────────────────
                                    ░ CARA MENGINPUT ELEMEN MATRIKS ░ 
                                    ─────────────────────────────────
                                    """);
                                System.out.print("> Gunakan spasi untuk pemisah antarkolom\n");
                                System.out.println("> Gunakan newline (enter) untuk pemisah antarbaris\n");

                                pause();
                                cls();

                                break;
                            
                            case "2":
                            case "BACK":
                                helpMenu = false;
                                break;
                            
                            default:
                                System.out.println("Tidak valid.");
                        }
                    }
                    break;

                case "9":
                case "EXIT":
                    System.out.println("""
                        
                        ───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───   ▀█▀ █░█ ▄▀█ █▄░█ █▄▀   █▄█ █▀█ █░█  ▀ ▀▄
                        ───█▒▒░░░░░░░░░▒▒█───   ░█░ █▀█ █▀█ █░▀█ █░█   ░█░ █▄█ █▄█  ▄ ▄▀
                        ────█░░█░░░░░█░░█────
                        ─▄▄──█░░░▀█▀░░░█──▄▄─   █▄▄ █▄█ █▀▀ ▄▄ █▄▄ █▄█ █▀▀  █
                        █░░█─▀▄░░░░░░░▄▀─█░░█   █▄█ ░█░ ██▄ ░░ █▄█ ░█░ ██▄  ▄

                        © 2023 | Yasmin, Attara, Ikhwan | Teknik Informatika ITB '22

                        """);
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
    
    public static void pause() {
        System.out.print("Press Enter to continue ....");
        try {
            System.in.read(); 
            System.in.skip(System.in.available()); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
