import java.util.Scanner;


public class TuesdayWeek3Task1 {

	public static void main(String[] args) {
		// Program which used switch. Input with scanner day. Print to console
		// is that day working day or weekend
		Scanner in = new Scanner(System.in);
		System.out.println("Input day of the week as a number from 1 to 7");
		int weekDay = in.nextInt();
		switch(weekDay){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Work day");
			break;
		case 6:
		case 7:	
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Input number from 1 to 7");
			break;
		}
		in.close();
	}

}
