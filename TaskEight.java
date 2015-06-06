
public class TaskEight {

	public static void main(String[] args) {
		// Program for calculating distance between the origin and A point in 3D
		//The origin has a point(0,0,0) 
		//A point(x4,x5,x6)
		int x4 = 7;
		int x5 = 4;
		int x6 = 2;
		boolean zero = x4 > 0 && x5 > 0 && x6 >0 ;
		double dist = Math.sqrt(x4 * x4 + x5 * x5 + x6 * x6);
		if(zero){
			System.out.print("Udaljenost tacke od koordinatnog pocetka je : " + dist);
		}else{
			System.out.print("Unesi pozitivne brojeve");
		}
	}

}
