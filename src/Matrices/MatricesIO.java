package Matrices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class MatricesIO {
                    
    public static void SaveMatrixToFile(double[][] matrix, String filename) {
        try {
            String outputFileName = filename + ".txt";
            String outputPath = "../test/";
            
            if (!Files.exists(Paths.get(outputPath))) {
                Files.createDirectories(Paths.get(outputPath));
            }

            File file = new File(outputPath + outputFileName);

            FileWriter writer = new FileWriter(file);

            int rows = matrix.length;
            int cols = matrix[0].length;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    writer.write(matrix[i][j] + " ");
                }
                writer.write("\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void SaveStringToFile(String content, String filename) {
        try {
            String outputFileName = filename + ".txt";
            String outputPath = "../test/";
    
            if (!Files.exists(Paths.get(outputPath))) {
                Files.createDirectories(Paths.get(outputPath));
            }
    
            File file = new File(outputPath + outputFileName);
    
            FileWriter writer = new FileWriter(file);
            writer.write(content);
    
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    public static double[][] FileToMatrix(String filename) {
        try {
            String inputFileName = "../test/" + filename + ".txt";

            File file = new File(inputFileName);

            if (!file.exists()) {
                System.out.println("\n░ >> File " + inputFileName + " doesn't exist!");
                pause();
                cls();
                return null;

            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int rows = 0;
            int cols = 0;

            while ((line = br.readLine()) != null) {
                rows++;
                String[] values = line.split(" ");
                cols = values.length;
            }

            br.close();

            double[][] matrix = new double[rows][cols];

            br = new BufferedReader(new FileReader(file));
            int row = 0;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(" ");
                for (int col = 0; col < cols; col++) {
                    try {
                        matrix[row][col] = Double.parseDouble(values[col]);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Invalid data!");
                        return null;
                    }
                }
                row++;
            }

            br.close();

            return matrix;
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
            return null;
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