public class TextIOThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.writeFile("src/input2.in.txt");
		int n = TextIO.getlnInt();

		int num;
		int min = n;

		for (int i = 1; i <= n; i++) {
			num = TextIO.getlnInt();
			if (num < min) {
				min = num;
			}
		}
		System.out.println("Minuimum is: " + min);
	}

}
