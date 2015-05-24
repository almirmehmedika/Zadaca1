public class TaskThree {

	public static void main(String[] args) {
		// Program for printing which date comes first
		int day1 = 10;
		int day2 = 11;
		int month1 = 3;
		int month2 = 3;
		int year1 = 2000;
		int year2 = 2000;

		if (year1 < year2) {
			System.out.print(day1 + "." + month1 + "." + year1);
		} else if (year1 > year2) {
			System.out.print(day2 + "." + month2 + "." + year2);
		} else {
			if (month1 < month2) {
				System.out.print(day1 + "." + month1 + "." + year1);
			} else if (month1 > month2) {
				System.out.print(day2 + "." + month2 + "." + year2);
			} else {
				if (day1 < day2) {
					System.out.print(day1 + "." + month1 + "." + year1);
				} else if (day1 > day2) {
					System.out.print(day2 + "." + month2 + "." + year2);
				} else {
					System.out.print("Dates are equal");
				}

			}

		}

	}

}
