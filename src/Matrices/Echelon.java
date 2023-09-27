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

    public static void SwapRowAll(double[][] matriks) {
	int m = matriks.length;
	int n = matriks[0].length;

	// ini bagian untuk tukar tukar baris
	for (int i = 0; i < m; i++) {
		if (matriks[i][i] != 0) continue;
		else {
			boolean swapped = false;
			for (int j = i + 1; j < m; j++) {
				if (matriks[j][i] != 0) {
					SwapRow(matriks, i, j);
					swapped = true;
//					System.out.println("swapped");
//					System.out.print("i nya " + i + " dan j nya " + j);
//					PrintMatrices.Print(matriks);
				}
			}
			if (!swapped) {
				for (int p = i + 1; p < m; p++) {
					for (int q = i; q < n; q++) {
						if (matriks[p][q] != 0) {
							SwapRow(matriks, p, i);
							swapped = true;
						}
						if (swapped) {
							break;
						}
					}
					if (swapped) {
						break;
					}
				}
			}
		}
	}
    }

    public static double[][] RowEchelon(double[][] matriks) {
	int m = matriks.length;
	int n = matriks[0].length;

	SwapRowAll(matriks);

	// ini bagian untuk buat eselon baris nya
	for (int i = 0; i < n; i++) {
		for (int j = i + 1; j < m; j++) {
			if (matriks[i][i] == 0) continue;
			else if (matriks[j][i] != 0) {
				double koef = matriks[j][i] / matriks[i][i];
				for (int k = i; k < m; k++) {
					matriks[j][k] -= (koef * matriks[i][k]);
				}
			}
		}
	}

	SwapRowAll(matriks);

	// ini bagian untuk buat 1 utama
//	for (int i = 0; i < m; i++) {
//		if (matriks[i][i] != 0) {
//			double koef = matriks[i][i];
//			for (int j = 0; j < n; j++) {
//				matriks[i][j] /= koef;
//		}
//	}
//		else {
//			for (int j = i; j < n; j++) {
//				if (matriks[i][j] != 0) {
//					double koef = matriks[i][j];
//					for (int k = 0; k < n; k++) {
//						matriks[i][k] /= koef;
//					}
//					break;
//				}
//			}
//		}
//	}
//
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
	
	// bagian forward step
	for (int i = 1; i < m; i++) {
		for (int j = i-1; j >= 0; j--) {
			double koef = matriks[j][i];
			for (int k = i; k < n; k++) {
				matriks[j][k] -= (koef * matriks[i][k]);
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
