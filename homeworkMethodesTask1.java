
public class homeworkMethodesTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int min	= getMin2(3,4);
//		System.out.println(min);
		int min1 = getMin3(3,1,1);
		System.out.println(min1);
		
	}
	public static int getMin2(int a, int b){
		return(a < b)? a:b;
	}
	public static int getMin3(int a, int b, int c){
		int min  =	getMin2(a,b);
		return(min < c)? min:c;
	}
}
