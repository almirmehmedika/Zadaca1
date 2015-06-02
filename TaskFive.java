public class TaskFive {

	public static void main(String[] args) {
		// Program forsorting four variables low to high
		int var1 = 6;
		int var2 = 5;
		int var3 = 3;
		int var4 = 2;
		int min;
		int min1;
		int max;
		int max1;
		int midlow;
		int midlow1;
		boolean a = var1 != var2;
		boolean b = var3 != var4;
		boolean c = var1 != var4;
		boolean d = var2 != var3;
		if (a && b && c && d) {
			if (var1 < var2) {
				min = var1;
			} else {
				min = var2;
			}

			if (var3 < var4) {
				min1 = var3;
			} else {
				min1 = var4;
			}

			if (min < min1) {
				System.out.print(min + ",");

			} else {
				System.out.print(min1 + ",");
			}
			if (min > min1) {
				midlow = min;
			} else {
				midlow = min1;
			}

			if (var1 > var2) {
				max = var1;
			} else {
				max = var2;
			}

			if (var3 > var4) {
				max1 = var3;
			} else {
				max1 = var4;
			}

			if (max < max1) {
				midlow1 = max;
			} else {
				midlow1 = max1;
			}
			if (midlow < midlow1) {
				System.out.print(midlow + ",");
			} else {
				System.out.print(midlow1 + ",");
			}
			if (midlow > midlow1) {
				System.out.print(midlow + ",");
			} else {
				System.out.print(midlow1 + ",");
			}

			if (max > max1) {
				System.out.print(max + ",");
			} else {
				System.out.print(max1 + ",");
			}

		}
	}

}
