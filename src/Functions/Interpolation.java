package Functions;
import Matrices.*;
import java.util.Scanner;

public class Interpolation {
	public static void Polynomial(int derajat) {
		Scanner scanner = new Scanner(System.in);

		double[][] titik = new double[derajat+1][2];
		double[][] matriks = new double[derajat+1][derajat+2];

		for (int i = 0; i <= derajat; i++) {
			System.out.println("Masukkan titik ke-" + (i + 1) + " (format: x y)");
			titik[i][0] = scanner.nextDouble();
			titik[i][1] = scanner.nextDouble();
		}

		for (int i = 0; i <= derajat; i++) {
			for (int j = 0; j <= derajat; j++) {
				matriks[i][j] = Math.pow(titik[i][0], j);
			}
		}

		for (int i = 0; i <= derajat; i++) {
			matriks[i][derajat+1] = titik[i][1];
		}

		PrintMatrices.Print(Echelon.ReducedRowEchelon(matriks));
	}

	public static void BicubicSpline() {
		Scanner scanner = new Scanner(System.in);

		double[][] matriks = new double[16][16];

		int idxX, idxY = 0;
	
		for (int x = 0; x < 2; x++) {
			idxX = 0;
			for (int y = 0; y < 2; y++) {
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						matriks[idxY][idxX] = Math.pow(x, i) * Math.pow(y, j);
						idxX++;
					}
				}
				idxX = 0;
				idxY++;
			}
		}

		for (int x = 0; x < 2; x++) {
			idxX = 0;
			for (int y = 0; y < 2; y++) {
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (i == 0) {
							matriks[idxY][idxX] = 0;
						}
						else {
							matriks[idxY][idxX] = i * Math.pow(x, i - 1) * Math.pow(y, j);
						}
						idxX++;
					}
				}
				idxX = 0;
				idxY++;
			}
		}

		for (int x = 0; x < 2; x++) {
			idxX = 0;
			for (int y = 0; y < 2; y++) {
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (j == 0) {
							matriks[idxY][idxX] = 0;
						}
						else {
							matriks[idxY][idxX] = j * Math.pow(x, i) * Math.pow(y, j - 1);
						}
						idxX++;
					}
				}
				idxX = 0;
				idxY++;
			}
		}

		for (int x = 0; x < 2; x++) {
			idxX = 0;
			for (int y = 0; y < 2; y++) {
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (i == 0 || j == 0) {
							matriks[idxY][idxX] = 0;
						}
						else {
							matriks[idxY][idxX] = i * j * Math.pow(x, i - 1) * Math.pow(y, j - 1);
						}
						idxX++;
					}
				}
				idxX = 0;
				idxY++;
			}
		}

		matriks = Echelon.RowEchelon(matriks);

		PrintMatrices.Print(matriks);

		System.out.println("Masukkan titik yang ingin ditaksir: (format: x y)");

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();

		double hasil = 0;

		int idx = 0;

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				hasil += (matriks[idx][16] * Math.pow(a, i) * Math.pow(b, j));
				idx++;
			}
		}

		System.out.println("Hasil taksirannya adalah " + hasil);
	}
}

