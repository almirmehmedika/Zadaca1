
public class TextIOFourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextIO.readFile("src/input3.in.txt");
		int n = TextIO.getInt();
		int m = TextIO.getInt();
		
		int num = 0;
		boolean isFound = false;
		for (int i = 0; i < n - 1; i++) {
			num = TextIO.getlnInt();
			if(num == m){
				isFound = true;
				break;
			}			
			
			}
		if(isFound){
			System.out.println("Number "+ m + " is there in file.");
		}	
		else {
			System.out.println("Number " + m + " not found in file.");
		}
	}

	}
