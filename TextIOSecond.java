
public class TextIOSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.readFile("src/input1.in.txt");
		
		int sum = 0;
		int num;
		do{
			num = TextIO.getInt();
			if(num == -1){
				break;
			}else{
				sum = sum + num;
				}
			
			}while(true);
		System.out.println("Sum is: " + sum);
	}

}
