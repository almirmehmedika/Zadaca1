
public class TaskTwo {

	public static void main(String[] args) {
		// Program to check the scope
		double a = 8;
		boolean scope1 = a >= 5 && a <= 7.5;
		boolean scope2 = a > 7.5 && a <= 10;
		
		if(scope1){
			System.out.print("Varijabla a se nalazi izmeðu 5 i 7.5");
		}else if(scope2){
			System.out.print("Varijabla a se nalazi izmeðu 7.5 i 10");
		}else{
			System.out.print("Varijabla a se nalazi van opsega");
		}
	}

}
