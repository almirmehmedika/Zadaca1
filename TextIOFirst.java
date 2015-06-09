
public class TextIOFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.readFile("src/input.in.txt");
		int m = TextIO.getInt();
		int n = TextIO.getInt();
		for(int i = m; i< n; i++ ){
			if(i > m){
				System.out.println(i);
			}
		}
		
	}

}
