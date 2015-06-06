
public class homeworkMethodesTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double per = getPercentage(30,35);
		System.out.println(per);
	}
	public static double getPercentage(int N, int M){
		double n = N;
		double m = M;
		double percentage = (n/m)*100;
		return percentage;
		
	}

}
