import java.util.Scanner;

public class HomeworkArraysTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Input number in first array: ");
			array1[i] = in.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Input number in second array: ");
			array2[i] = in.nextInt();
		}
		int counter = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				counter++;
			}
		}
		if (counter > 0) {
			System.out.println("Arrays are not identical");
		} else {
			System.out.println("Arrays are identical");
		}
	in.close();
	}
}
