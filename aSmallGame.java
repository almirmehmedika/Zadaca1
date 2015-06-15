import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class aSmallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = array();
		long timeStart = System.currentTimeMillis();
		Scanner in = new Scanner(System.in);
		while (haveAllZero(array1) != true) {
			
				try {
					System.out.println(Arrays.toString(array1));
					System.out.println("Input index: ");
					int index = in.nextInt();
					if (array1[index] == 0) {
						continue;
					}

					if (index % 2 == 0) {
						try {
							if (array1[index - 1] < 0) {

							} else {
								array1[index - 1] += index;
								if (array1[index - 1] > 4) {
									array1[index - 1] = 4;
								}
							}
						} catch (ArrayIndexOutOfBoundsException e) {

						}
						try {
							if (array1[index + 1] > 4) {
							} else {
								array1[index + 1] += index;
								if (array1[index + 1] > 4) {
									array1[index + 1] = 4;
								}

							}
						} catch (ArrayIndexOutOfBoundsException ex) {

						}

						if (array1[index] > 0) {
							array1[index] = array1[index] - 1;
						} else {
						}

					} else {
						if (array1[index - 1] > 0) {
							array1[index - 1] -= index;
							if (array1[index - 1] < 0) {
								array1[index - 1] = 0;
							}
						} else {
							
						}
						if (array1[index + 1] > 0) {
							array1[index + 1] -= index;
							if (array1[index + 1] < 0) {
								array1[index + 1] = 0;
							}
						} else {

						}
						if (array1[index] > 0) {
							array1[index] = array1[index] - 1;
						} else {
						}

					}

				} catch (InputMismatchException ex) {
					System.out.println("Input number in to index");
					in.nextLine();
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("Index out of bounds");
					in.nextLine();
				}

			}
	in.close();
	System.out.println("Game over");	
	long timeFinish = System.currentTimeMillis();
	long timePast = timeFinish - timeStart;
	System.out.println("Igro si " + timePast/1000 + " sekundi");
	}
	

	public static int[] array() {
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = (int) (Math.random() * 4 + 1);
		}
		return array;
	}

	public static boolean haveAllZero(int[] array1) {
		int[] zeroArray = new int[5];
		for (int i = 0; i < 5; i++) {
			if (zeroArray[i] != array1[i]) {
				return false;
			}
		}
		return true;
	}
	
}