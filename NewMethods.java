

public class NewMethods {
	public static void main(String[] args) {
		summonAllMethods();
	}
	public static void summonAllMethods() {
		
		int[][] arr2d = { { 1, 2, 1 }, { 5, 2, 8 }, { -4, 2, 3 } };
		int n = 1;
		int howMany = countNumber(arr2d, n);
		System.out.println("Number " + n + " was repeated " + howMany
				+ " times in the matrix");
		int[][] array2d = { { 1, -2, 1 }, { 5, 0, 4 }, { -4, 2, 2 } };
		int sumZero = getNumOfZeroRowsAndColumns(array2d);
		System.out.printf("%d rows and columns have sum equals zero", sumZero);
		System.out.println();
		int[][] array2d1 = { { 1, 2, 1 }, { 5, 2, 8 }, { -4, 2, 3 } };
		int horsemanMove = getMaxPoints(array2d1, 2, 2);
		System.out.println("Max points is : " + horsemanMove);
	}

	/**
	 * Counting how many times number is repeated in the matrix
	 * 
	 * @param matrix
	 *            - integer 2D array
	 * @param number
	 *            - integer number
	 * @return integer
	 */

	public static int countNumber(int[][] matrix, int number) {
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					counter++;
				}
			}
		}
		return counter;
	}

	/**
	 * count how many row and columns have sum equals zero
	 * 
	 * @param matrix
	 *            - integer 2D array
	 * @return integer number
	 */
	public static int getNumOfZeroRowsAndColumns(int[][] matrix) {
		int counter = 0;
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum = 0;
			sum1 = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				sum1 += matrix[j][i];
			}
			if (sum == 0 || sum1 == 0) {
				counter++;
			}
		}
		return counter;
	}
	/**
	 * Works only for matrix 3x3. For specific coordinate ordered max number of points
	 * Max number of points is based on horseman movement(chess)
	 * @param matrix - integer 2D array
	 * @param x - integer number of row
	 * @param y - integer number of column
	 * @return integer 
	 */
	public static int getMaxPoints(int[][] matrix, int x, int y) {
		if (x == 0 && y == 0) {
			if (matrix[x + 1][y + 2] > matrix[x + 2][y + 1]) {
				return matrix[x + 1][y + 2];
			} else {
				return matrix[x + 2][y + 1];
			}
		} else if (x == 0 && y == 1) {
			if (matrix[x + 2][y - 1] > matrix[x + 2][y + 1]) {
				return matrix[x + 2][y - 1];
			} else {
				return matrix[x + 2][y + 1];
			}
		} else if (x == 0 && y == 2) {
			if (matrix[x + 1][y - 2] > matrix[x + 2][y - 1]) {
				return matrix[x + 1][y - 2];
			} else {
				return matrix[x + 2][y - 1];
			}
		} else if (x == 1 && y == 0) {
			if (matrix[x - 1][y + 2] > matrix[x + 1][y + 2]) {
				return matrix[x - 1][y + 2];
			} else {
				return matrix[x + 1][y + 2];
			}
		} else if (x == 1 && y == 1) {
			return matrix[x + 1][y + 1];
		} else if (x == 1 && y == 2) {
			if (matrix[x - 1][y - 2] > matrix[x + 1][y - 2]) {
				return matrix[x - 1][y - 2];
			} else {
				return matrix[x + 1][y - 2];
			}
		}else if (x == 2 && y == 0) {
			if (matrix[x - 2][y + 1] > matrix[x - 1][y + 2]) {
				return matrix[x - 2][y + 1];
			} else {
				return matrix[x - 1][y + 2];
			}
		}else if (x == 2 && y == 1) {
			if (matrix[x - 2][y - 1] > matrix[x - 2][y + 1]) {
				return matrix[x - 2][y - 1];
			} else {
				return matrix[x - 2][y + 1];
			}
		}else if( x == 2 && y == 2){
			if (matrix[x - 1][y - 2] > matrix[x - 2][y - 1]) {
				return matrix[x - 1][y - 2];
			} else {
				return matrix[x - 2][y - 1];
			}
		}else
			return 0;
	}
}
