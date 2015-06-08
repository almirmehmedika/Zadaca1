import java.util.Scanner;

public class TuesdayWeek3Task2 {

	public static void main(String[] args) {
		// Program that loads the file and print to console factorial of the first 
		// number in the file. Files can contain a variety of things
		Scanner in = new Scanner(System.in);
		// Spinning a loop until the user enters a file which exists
		// If input is wrong catch exception
		while (true)
			try {
				System.out.print("Input file name: ");
				String fileName = in.next();
				TextIO.readFile(fileName);
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println("File doesn't exist");
				in.nextLine();
			}
		int num;
		while(true){
			try {
				System.out.println("Read first number from file");
				num = TextIO.getInt();
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println("First sign isn't number");
				in.nextLine();
			}
		}
		int product = 1;
		for(int i = 2; i <= num ; i++){
			product *= i;
		}
		
		TextIO.writeStandardOutput();
		System.out.println("Factorial of number from file is" + product);
		in.close();
		
	}
}
