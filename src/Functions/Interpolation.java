package Functions;
import Matrices.*;
import Operations.*;

public class Interpolation {
	public static double Polynomial(double[][] titik, double a) {
		// input matriksnya berbentuk double[derajat+1][2]

		int derajat = titik.length - 1;

		double[][] matriks = new double[derajat+1][derajat+2];

		for (int i = 0; i <= derajat; i++) {
			for (int j = 0; j <= derajat; j++) {
				matriks[i][j] = Math.pow(titik[i][0], j);
			}
		}

		for (int i = 0; i <= derajat; i++) {
			matriks[i][derajat+1] = titik[i][1];
		}

		matriks = Echelon.ReducedRowEchelon(matriks);

		double hasil = 0;
		for (int i = 0; i <= derajat; i++) {
			hasil += (matriks[i][derajat+1] * Math.pow(a, i));
		}

		return hasil;
	}

	public static double BicubicSpline(double[][] input, double a, double b) {
		// input matriksnya berbentuk double[4][4]
		// dari kiri ke kanan urutan tiitknya adalah (0,0), (1,0), (0,1), (1,1)
		// dari atas ke bawah urutannya adalah nilai original, nilai turunan di x, nilai turunan di y, nilai turunan di keduanya
		// a dan b adalah titik yg ingin di taksir (a itu x dan b itu y)

		double[][] matriks = new double[16][16];

		int idxX, idxY = 0;

		// bagian buat matriks 16x16	
		while (idxY < 16) {
			for (int x = 0; x < 2; x++) {
				idxX = 0;
				for (int y = 0; y < 2; y++) {
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
							if (idxY < 4) {
								matriks[idxY][idxX] = Math.pow(x, i) * Math.pow(y, j);
							}
							else if (idxY < 8) {
								if (j == 0) {
									matriks[idxY][idxX] = 0;
								}
								else {
									matriks[idxY][idxX] = j * Math.pow(x, i) * Math.pow(y, j - 1);
								}
							}
							else if (idxY < 12) {
								if (i == 0) {
									matriks[idxY][idxX] = 0;
								}
								else {
									matriks[idxY][idxX] = i * Math.pow(x, i - 1) * Math.pow(y, j);
								}
							}
							else {
								if (i == 0 || j == 0) {
									matriks[idxY][idxX] = 0;
								}
								else {
									matriks[idxY][idxX] = i * j * Math.pow(x, i - 1) * Math.pow(y, j - 1);
								}
							}
							idxX++;
						}
					}
					idxX = 0;
					idxY++;
				}
			}
		}

		matriks = Inverse.OBE(matriks);

		double[][] nilai = new double[16][1];

		int idx = 0;		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				nilai[idx][0] = input[i][j];
				idx++;
			}
		}

		double[][] matriksA = Multiplies.MultiplyMatrix(matriks, nilai);

		double hasil = 0;

		idx = 0;

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				hasil += (matriksA[idx][0] * Math.pow(a, i) * Math.pow(b, j));
				idx++;
			}
		}

		return hasil;
	}
}

