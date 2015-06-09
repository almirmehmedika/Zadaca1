


public class Task1Task2Task3 {

	public static void main(String[] args) {
		System.out.println(celsiusToKelvins(3));
		try{
		int min = Integer.parseInt(args[0]);
		for(int i = 1; i < args.length; i++){
			if(min > Integer.parseInt(args[i])){
				min = Integer.parseInt(args[i]);
			}
		}
		System.out.println(min);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Moras proslijediti barem jedan parametar");
		}catch(NumberFormatException ex){
			System.out.println("Moras proslijediti iskljucivo brojeve");
		}
		try{
		String s = args[0];
		int a = stringHaveNumbers(s);
		System.out.println(s + " contains " + a + " numbers!");
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Moras proslijediti barem jedan parametar");
		}
		
	}
	/**
	 * Convert Celsius to Kelvins
	 * @param a - double number
	 * @return double number
	 */
	public static double celsiusToKelvins(double a){
		return a + 273.15;
	}
	/**
	 * Counts how many numbers is contained in string
	 * @param s - string
	 * @return integer number
	 */
	public static int stringHaveNumbers(String s){
		int counter = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
				counter++;
			}
		}
		return counter;
	}
	
}
