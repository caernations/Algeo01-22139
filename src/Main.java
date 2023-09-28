import java.util.*;

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
            String choice = scanner.next().toUpperCase();

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
                        String subChoice = scanner.next().toUpperCase();

                        switch (subChoice) {
                            case "A":
                            case "ADDITION":
                                // Addition
                                break;

                            case "B":
                            case "SUBTRACTION":
                                // Substraction
                                break;

                            case "C":
                            case "TRACE":
                                // Trace
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
                                    String multiplyChoice = scanner.next().toUpperCase();

                                    switch (multiplyChoice) {
                                        case "I":
                                        case "MULTIPLY MATRICES":
                                            // MultiplyMatrices
                                            break;

                                        case "II":
                                        case "MULTIPLY MATRICES BY CONSTANT":
                                            // MultiplyMatricesByConstant
                                            break;

                                        case "III":
                                        case "MULTIPLY MATRICES WITH MOD":
                                            // MultiplyMatricesWithMod
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
                        String splChoice = scanner.next().toUpperCase();
    
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
                        String determinantChoice = scanner.next().toUpperCase();

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
                        String inverseChoice = scanner.next().toUpperCase();

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
                    System.out.println("Terima kasih! Program berakhir.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu (1-8) yang valid.");
            }
        }
    }
}
