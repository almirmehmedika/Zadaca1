
public class MondayWeek2Task1 {

	public static void main(String[] args) {
		/* write such a code to determine how many times n can divide before it
		becomes zero and the result printed on the console*/
		int n = 12;
		int c = 1;
		int brojac = 0;
		while(c <= n){
				if(n % c == 0){
					brojac++;
					c++;
				}else{
					c++;
				} 
			  
			}
		System.out.println(brojac);	
		}
		
	}


