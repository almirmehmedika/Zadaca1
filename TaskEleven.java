
public class TaskEleven {

	public static void main(String[] args) {
		// Program which determines when plane is going to land
		// Input time when plane take off
		int hour = 20;
		int min = 34;
		// Input time flying
		int hour1 = 4;
		int min1 = 50;
		
		int hour2 = hour + hour1;
		int min2 = min + min1;
		int min3 = min2 % 60;
		int hour3 = min2 / 60;
		int hour4 = hour2 + hour3;
		int day = hour4 % 24; 
		boolean hour5 = hour >= 0 && hour < 24;
		boolean hour6 = hour1 >= 0 && hour1 < 24;
		boolean min4 = min >= 0 && min < 60;
		boolean min5 = min1 >= 0 && min1 < 60;
		
		if(hour4 >= 24){
			System.out.print("Vrijeme slijetanja je " + day + ":" + min3);
		}else if(hour5 && hour6 && min4 && min5){
			System.out.print("Vrijeme slijetanja je " + hour4 + ":" + min3);
		}else{
			System.out.print("Upisali ste pogrijesno vrijeme");
		}
		
	}

}
