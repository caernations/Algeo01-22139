import java.util.Scanner;

public class Determinan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima nilai n
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        // Menerima matriks berukuran nxn dari pengguna
        System.out.println("Masukkan matriks berukuran " + n + "x" + n + ":");
        double[][] matriks = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Masukkan elemen baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                matriks[i][j] = scanner.nextDouble();
            }
        }

        // Menghitung determinan matriks
        double determinan = hitungDeterminan(matriks);

        // Menampilkan hasil determinan
        System.out.println("Determinan matriks tersebut adalah: " + determinan);

        scanner.close();
    }
    // Fungsi untuk menghitung determinan
    public static double hitungDeterminan(double[][] matriks) {
        int n = matriks.length;
        if (n == 1) {
            return matriks[0][0];
        }
        if (n == 2) {
            return matriks[0][0] * matriks[1][1] - matriks[0][1] * matriks[1][0];
        }

        double determinan = 0;
        for (int i = 0; i < n; i++) {
            determinan += matriks[0][i] * kofaktor(matriks, 0, i);
        }
        return determinan;
    }

    // Fungsi untuk menghitung kofaktor
    public static double kofaktor(double[][] matriks, int baris, int kolom) {
        int n = matriks.length;
        double[][] minor = new double[n - 1][n - 1];
        int minorBaris = 0;
        for (int i = 0; i < n; i++) {
            if (i == baris) continue;
            int minorKolom = 0;
            for (int j = 0; j < n; j++) {
                if (j == kolom) continue;
                minor[minorBaris][minorKolom] = matriks[i][j];
                minorKolom++;
            }
            minorBaris++;
        }
        return Math.pow(-1, baris + kolom) * hitungDeterminan(minor);
    }
}

