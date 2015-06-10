public class TaskTen {

	public static void main(String[] args) {
		//Program that determines whether a given number of the solutions from the given equation
		int x = 1;
		int a = 1;
		int b = -1;
		int c = 4;
		int d = -4;
		boolean res = a * x * x * x + b * x * x + c * x + d == 0;
		boolean res1 = b * b * x + c * x + d == 0;
		boolean res2 = c * x + d == 0;
		if (a == 0 && b == 0) {
			if (res2) {
				System.out.print("Broj " + x
						+ " je jedno od rjesenja date linearne jednacine");
			} else {
				System.out.print("Broj " + x
						+ " nije rjesenje date linearne jednacine");
			}
		}
		if (a == 0 && b != 0) {
			if (res1) {
				System.out.print("Broj " + x
						+ " je jedno od rjesenja date kvadratne jednacine");
			} else {
				System.out.print("Broj " + x
						+ " nije jedno od rjesenja date kvadratne jednacine");
			}
		}

		if (a != 0 && b != 0) {
			if (res) {
				System.out.print("Broj " + x
						+ " je jedno od rjesenja date kubne jednacine");
			} else {
				System.out.print("Broj " + x
						+ " nije nijedno od rjesenja date kubne jednacine");
			}

		}
	}
}
