public class TaskSix {

	public static void main(String[] args) {
		// Program for determine AM or PM
		int hour = 1;
		// Input double-digit number ab for minutes
		int a = 3;
		int b = 4;
		int min = a * 10 + b;
		boolean hour1 = hour >= 0 && hour <= 24;
		boolean min1 = min >= 0 && min < 60;
		boolean hour2 = hour >= 0 && hour < 12;

		if (hour1 && min1) {
			if (hour2) {
				System.out.print(hour + ":" + min + " AM");
			} else {
				System.out.print(hour + ":" + min + " PM");
			}
		}
	}
}
