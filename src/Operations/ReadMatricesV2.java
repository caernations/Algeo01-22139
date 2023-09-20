import java.util.Scanner;

public class ReadMatricesV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran n (misalnya 3 untuk matriks 3x3): ");
        int n = scanner.nextInt();
        
        double[][] matrix = new double[n][n];

        System.out.println("Masukkan matriks berukuran " + n + "x" + n + " dengan elemen-elemen dipisahkan oleh spasi dan baris-baris dipisahkan oleh newline:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (scanner.hasNextDouble()) {
                    matrix[i][j] = scanner.nextDouble();
                } else {
                    System.out.println("Input tidak valid. Pastikan format sesuai.");
                    return;
                }
            }
        }

        // Menampilkan matriks
        System.out.println("Matriks yang dimasukkan:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Menghitung determinan menggunakan fungsi dari kelas Determinan
        double determinan = Determinan.hitungDeterminan(matrix);
        System.out.println("Determinan matriks tersebut adalah: " + determinan);

        scanner.close();
    }
}
