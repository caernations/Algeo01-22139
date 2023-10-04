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

        © 2023 | Yasmin, Attara, Ikhwan | IF'22""");
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
                    boolean matricesMenu = true;
                    while (matricesMenu) {
                        System.out.println("""
                            
                            █▀█ █▀█ █▀▀ █▀█ ▄▀█ ▀█▀ █ █▀█ █▄░█ █▀
                            █▄█ █▀▀ ██▄ █▀▄ █▀█ ░█░ █ █▄█ █░▀█ ▄█


                            ░ 1. Addition (+)
                            ░ 2. Subtraction (-)
                            ░ 3. Trace (tr)
                            ░ 4. Multiply (*)
                            ░ 5. Back
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
                                                    System.out.println("Matriks harus merupakan matriks persegi untuk menghitung trace.");
                                                }
                                            } else {
                                                System.out.println("Matriks harus merupakan matriks persegi untuk menghitung trace.");
                                            }

                                            break;

                                        case "2":
                                        case "FILE":
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
                                                        
                                                        case "2":
                                                        case "FILE INPUT":
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
                                                    case "KEYBOARD INPUT":
                                                        double[][] matrixiiD1 = ReadMatrices.Keyboard();

                                                        System.out.println("Constanta: ");
                                                        double constant = scanner.nextDouble();
                                                        scanner.nextLine();
                                                        
                                                        double[][] resultMultiplyMatrixByConstant = Multiplies.MultiplyMatrixByConstant(matrixiiD1, constant);

                                                        System.out.println("Result:");
                                                        PrintMatrices.Print(resultMultiplyMatrixByConstant);
                                                        break;

                                                    case "2":
                                                    case "FILE INPUT":
                                                        break;

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

                                                    case "2":
                                                    case "FILE INPUT":

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
                                            System.out.println("Pilihan sub-menu tidak valid.");
                                    }
                                }
                                break;

                            case "5":
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
                                // nama1
                                break;
    
                            case "2":
                            case "GAUSS-JORDAN ELIMINATION METHOD":
                                // nama2
                                break;
    
                            case "3":
                            case "INVERSE MATRICES METHOD":
                                // nama2
                                break;
    
                            case "4":
                            case "CRAMER METHOD":
                                // nama2
                                break;
                            
                            case "5":
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
                            ░ 1. Cofactor Expansion Method
                            ░ 2. det2
                            ░ 3. Back
                            """);
                        
                        System.out.print("░ >> Choose: ");
                        String determinantChoice = scanner.nextLine().toUpperCase();

                        pause();
                        cls();

                        switch (determinantChoice) {
                            case "1":
                            case "Cofactor Expansion Method":
                                // nama1
                                break;

                            case "2":
                            case "det2":
                                // nama2
                                break;
                            
                            case "3":
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
                                // nama1
                                break;

                            case "2":
                            case "ADJOINT METHOD":
                                // nama2
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