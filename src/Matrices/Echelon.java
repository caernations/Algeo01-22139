package Matrices;

public class Echelon {
    public static void SwapRow(double[][] matriks, int row1, int row2) {
	int n = matriks[0].length;
	double[] temp = new double[n];

	for (int i = 0; i < n; i++) {
		temp[i] = matriks[row1][i];
	}
	for (int i = 0; i < n; i++) {
		matriks[row1][i] = matriks[row2][i];
	}
	for (int i = 0; i < n; i++) {
		matriks[row2][i] = temp[i];
	}
    }

    public static double[][] RowEchelon(double[][] matriks) {
	int m = matriks.length;
	int n = matriks[0].length;

	for (int i = 0; i < m; i++) {
		if (matriks[i][i] == 0) {
			boolean swapped = false;
			while (!swapped) {
				for (int j = i + 1; j < m; j++) {
					if (matriks[j][i] != 0) {
						SwapRow(matriks, i, j);
						swapped = true;
					}
				}
			}
		}

		for (int j = i + 1; j < m; j++) {
			if (matriks[j][i] != 0) {
				double koef = matriks[j][i] / matriks[i][i];
				for (int k = i; k < n; k++) {
					matriks[j][k] -= koef * matriks[i][k];
				}
			}
		}
	}
        return matriks;
    }

    public static double[][] ReducedRowEchelon(double[][] matriks) {
	int m = matriks.length;
	int n = matriks[0].length;
	
	matriks = RowEchelon(matriks);

	// bagian ngubah diagonal jadi satu
	for (int i = 0; i < m; i++) {
		if (matriks[i][i] != 0) {
			double koef = matriks[i][i];
			for (int j = 0; j < n; j++) {
				matriks[i][j] /= koef;
		}
	}
		else {
			for (int j = i; j < n; j++) {
				if (matriks[i][j] != 0) {
					double koef = matriks[i][j];
					for (int k = 0; k < n; k++) {
						matriks[i][k] /= koef;
					}
					break;
				}
			}
		}
	}
	
	// bagian backward step
	for (int i = 1; i < m; i++) {
		for (int j = i-1; j >= 0; j--) {
			double koef = matriks[j][i];
			for (int k = i; k < n; k++) {
				matriks[j][k] -= (koef * matriks[i][k]);
			}
		}
	}

	return matriks;
    }
}
