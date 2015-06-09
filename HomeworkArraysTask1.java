import java.util.Arrays;

public class HomeworkArraysTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayHundred = new int[100];

		for (int j = 0; j < 10; j++) {

			for (int i = 0; i < arrayHundred.length; i++) {

				arrayHundred[i] = i % 10;

			}

			j++;
		}
		System.out.println(Arrays.toString(arrayHundred));
	}
}
