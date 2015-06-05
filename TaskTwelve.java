
public class TaskTwelve {

	public static void main(String[] args) {
		// Program to determine the quality of ball
		double radius = 1.24;
		double volume = 4/3 * radius * radius * radius * Math.PI ;
		boolean deviation = volume >= 5.964 && volume <= 6.064 ;
		if(deviation){
			System.out.print("Zapremina : " + volume + ". " + "Lopta je dobre kvalitete");
		}else{
			System.out.print("Zapremina : " + volume + ". " + "Lopta nije dobre kvalitete");
		}
	}

}
