import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// Input two arrays with scanner.
		Scanner in = new Scanner(System.in);
		int n = 0;
		int m = 0;
		int[] array1;
		int[] array2;
		// Input arrays length from users
		// catch every exception
		while (true) {
			try {
				System.out.println("Input length of the first array: ");
				n = in.nextInt();
				array1 = new int[n];
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Input number");
				in.nextLine();
			} catch (NegativeArraySizeException ex) {
				System.out.println("Array length can't be negative ");
				in.nextLine();
			}
		}
		while (true) {
			try {
				System.out.println("Input length of the second array: ");
				m = in.nextInt();
				array2 = new int[m];
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Input number");
				in.nextLine();
			} catch (NegativeArraySizeException ex) {
				System.out.println("Array length can't be negative ");
				in.nextLine();
			}
		}
		// Users put numbers in to arrays
		for (int i = 0; i < n; i++) {
			while (true) {
				try {
					System.out.println("Input number to array");
					array1[i] = in.nextInt();
					break;
				} catch (InputMismatchException ex) {
					System.out.println("Wrong input");
					in.nextLine();
				}
			}

		}
		for (int i = 0; i < m; i++) {
			while (true) {
				try {
					System.out.println("Input number to array");
					array2[i] = in.nextInt();
					break;
				} catch (InputMismatchException ex) {
					System.out.println("Wrong input");
					in.nextLine();
				}
			}
		}
		// Prints arrays on the screen
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		// Summon methods
		boolean truth = areArraysEquals(array1, array2);
		System.out.println(truth);
		int[] array3 = sumTwoArrays(array1, array2);
		System.out.println(Arrays.toString(array3));
		int[] array4 = allInOneArray(array1, array2);
		System.out.println(Arrays.toString(array4));
		in.close();
	}

	public static boolean areArraysEquals(int[] array1, int[] array2) {
		// Methods for checking is two arrays are equals.
		// Arrays are equal if they have equal length
		// Arrays are equal if they contain the same elements in the same index
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					return false;
				}

			}
			return true;
		} else {
			return false;
		}

	}

	public static int[] sumTwoArrays(int[] array1, int[] array2) {
		// Write a method that receives that two arrays
		// and returns the third which is the sum of elements with the same
		// index
		int num1 = 0;
		// Convert elements of array to integer
		for (int i = 0; i < array1.length; i++) {
			num1 = num1 * 10 + array1[i];
		}

		int num2 = 0;
		for (int i = 0; i < array2.length; i++) {
			num2 = num2 * 10 + array2[i];
		}
		// Converting them to string
		String result = "" + (num1 + num2);
		// Create empty array with length of string
		int[] array3 = new int[result.length()];
		// Take characters of the string and convert them to integer and put
		// them
		// to array
		for (int i = 0; i < array3.length; i++) {
			array3[i] = Integer.parseInt(result.charAt(i) + "");
		}

		return array3;
	}

	public static int[] allInOneArray(int[] array1, int[] array2) {
		// Take arrays length, sum them, and create new arrays with length of
		// sum
		int a = array1.length;
		int b = array2.length;
		int[] array3 = new int[a + b];
		// Put elements of first array to new array
		for (int i = 0; i < a; i++) {
			array3[i] = array1[i];
		}
		// Put elements of second array to new array
		for (int i = 0; i < b; i++) {

			array3[a + i] = array2[i];
		}
		return array3;
	}
	
}
