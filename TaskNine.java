public class TaskNine {

	public static void main(String[] args) {
		/* Program which for triple-digit number to determine whether it is 
		 divisible by the sum of its digits */
		
		int var = 500;
		boolean var1 = var >= 100 && var < 999;
		int mod1 = var % 10;
		int div1 = var / 10;
		int mod2 = div1 % 10;
		int div2 = div1 / 10;
		int sum = mod1 + mod2 + div2;
		boolean div3 = var % sum == 0;
		if (var1) {
			if (div3) {
				System.out.print("Broj " + var + " je djeljiv sa zbirom svojih cifara");
			} else {
				System.out.print("Broj " + var + " nije djeljiv sa zbirom svojih cifara");
			}
		} else {
			System.out.print("Upiši trocifren broj");
		}
	}

}
