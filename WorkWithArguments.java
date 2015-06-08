
public class WorkWithArguments {

	public static void main(String[] args) {
		double[] array = new double[args.length];
		if (args.length == 0) {
			System.out.println("Moras unijeti makar jedan parametar");
			System.exit(0);
		}
		for (int i = 0; i < args.length; i++) {

			 
				try {
					array[i] = Double.parseDouble(args[i]);
					
				} catch (NumberFormatException ex) {
					System.out.println("Unio si slovo ili znak.");
					System.out.println("Sljedeci put unesi broj");
					System.exit(0);
				}
				
			if (array[i] == 0) {
				System.out.println("Ne smijes dati nulu kao parametar. ");
				System.out.println("Sad moras ponovo pokrenuti program");
				System.exit(0);
			}
		}
		
		for (int i = 0; i < args.length; i++) {
			System.out.printf("%.2f", array[i]);
			if (i == args.length - 1) {
				break;
			}
			System.out.print(", ");
		}
		System.out.println();
		double product = 1;
		for (int i = 0; i < args.length; i++) {
			product *= array[i];
		}
		System.out.printf("Product is: %f", product);


	}

}
