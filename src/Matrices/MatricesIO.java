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
            System.out.println("Matrix has been saved to " + outputFileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    public static double[][] FileToMatrix(String filename) {
        try {
            String inputFileName = "../test/" + filename + ".txt";

            File file = new File(inputFileName);

            if (!file.exists()) {
                System.out.println("File not found: " + inputFileName);
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
                        System.out.println("Error: Data in the file is not a valid double.");
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
}