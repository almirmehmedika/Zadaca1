
public class Animal {
	private String name;
	private int activeDayOrNight;
	private int needsWater;
	private static int dayOrNight = 1;
	private static int habitatWater = 1;
	
	public Animal(String name, int activeDayOrNight, int needsWater) {
		if(activeDayOrNight >= 1 && activeDayOrNight <=2 && needsWater >= 1 && needsWater <=3){
			this.name = name;
			this.activeDayOrNight = activeDayOrNight;
			this.needsWater = needsWater;			
		} else {
			throw new NullPointerException();
		}
		
		
	}
	
	public static void changeDayAndNight(){
		if(dayOrNight == 1){
			dayOrNight = 2;
		} else {
			dayOrNight = 1;
		}
	}
	public void printStatus(){
		if(activeDayOrNight == dayOrNight && needsWater == habitatWater) {
			System.out.println("It's fine. The animal is active and has water.");
		} else if(activeDayOrNight != dayOrNight && needsWater == habitatWater) {
			System.out.println("The animal is not active, but has enough water.");
		} else if(activeDayOrNight == dayOrNight && needsWater != habitatWater) {
			System.out.println("The animal is active, but does not have enough water.");
		} else if(activeDayOrNight != dayOrNight && needsWater != habitatWater) {
			System.out.println("The animal is not active and it does not have enough water.");
		}  
	}
	public static void setAmountOfWater(int water) throws IllegalArgumentException{
		if(habitatWater >= 0 && habitatWater <=3){
			habitatWater = water;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
