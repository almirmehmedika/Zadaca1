
public class MainTest {
	public static void main(String[] args) {
		Cashbox c1 = new Cashbox("Crni fond");

		c1.printInformation(); // Isprinta "It is empty..."

		c1.addMoney(30); // Doda 30 KM u kasu

		c1.printInformation(); // Isprinta "There's some."

		c1.addMoney(100);

		c1.printInformation(); // Isprinta "There's a lot."

		c1.clearCashbox(); // Isprazni sef/kasu

		c1.printInformation(); // Isprinta "It is empty..."
		
		

		Animal a1 = new Animal("Animal 1", 1, 1);

		Animal a2 = new Animal("Animal 2", 2, 3);

		// "It's fine. The animal is active and has water."

		a1.printStatus();

		// "The animal is not active and it does not have enough water."

		a2.printStatus();

		Animal.changeDayAndNight(); // Dan prelazi u noć

		Animal.setAmountOfWater(3); // Sada vrijednost vode prelazi na 3

		// "The animal is not active, but has enough water."

		a1.printStatus();

		// "It's fine. The animal is active and has water."

		a2.printStatus();
	}
}
