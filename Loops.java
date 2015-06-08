public class Loops {

	public static void main(String[] args) {
		System.out.println("Number have " + howManyDigits(10) + " digits");
		commaAfterThreeDigits(-3456700);
		System.out.println();
		int Q = replaceFirstAndLastDigit(12);
		System.out.println(Q);
		range(10,15);
	}

	public static void commaAfterThreeDigits(int n) {

		System.out.printf("%,d", n);

	}

	public static int howManyDigits(int n) {
		int counter = 0;
		if (n == 0) {
			return 1;
		} else {

			while (n != 0) {
				n /= 10;
				counter++;
			}
			return counter;
		}
	}

	public static int replaceFirstAndLastDigit(int n) {
		if (n < 10) {
			return n;
		} else if (n < 100) {
			int a = n / 10;
			int b = n % 10;
			String s2 = b + "" + a;
			return Integer.parseInt(s2);
		} else {
			int second = n % 10;
			int first = n;
			while (first > 10) {
				first /= 10;
			}
			int i = 10;
			int counter = 0;
			n /= 10;
			while (n / i != 0) {
				i *= 10;
				counter++;
			}

			n = n % (int) (Math.pow(10, counter));

			String s = second + "" + n + first;

			return Integer.parseInt(s);
		}
	}

	public static void range(int n, int q) {
		int difference = q - n - 1;
		if (difference <= 0) {
			System.out.println("There is no number between n and q");
			;
		} else {
			if (difference % 2 == 0) {
				int i = n + 2;
				while (i < q) {
					System.out.print(i + ", ");
					i += 2;
				}
			} else {
				int i = n + 1;
				while (i < q) {
					System.out.println(i + ", ");
					i += 2;
				}
			}
		}
	}
}
