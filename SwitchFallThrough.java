import java.util.Scanner;


public class SwitchFallThrough {

	public static void main(String[] args) {
		// Input integer n through scanner. Number n represent time in hours.
		// Determine whether the then lecture , exercises , homework or sleeping.
		// Lectures are from 9h to 13h
		// Exercises are from 14h to 17h
		// Homework is from 18h to 1h
		// Sleeping is from 2h to 8h
		// It's necessarily to use switch and fall through
		Scanner in = new Scanner(System.in);
		System.out.println("Hours is: ");
		int n = in.nextInt();
		in.close();
		switch(n){
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:	
			System.out.println("Lecture");
		case 14:
		case 15:
		case 16:
		case 17:
			System.out.println("Exercises");
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 0:
		case 1:
			System.out.println("Homework");
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("Sleeping");
			break;
		default:
			System.out.println("Wrong time input");
		}
		
	}
	
}
