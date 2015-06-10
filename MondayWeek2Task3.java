
public class MondayWeek2Task3 {

	public static void main(String[] args) {
		/* Write a program that determines whether a given number n perfect or not.
		 * perfect number is a number in which the sum of the numerator (excluding yourself)
		 *  actually gives that number. eg. No. 28 is perfect because it is the sum of its 
		 *  numerator 1,2,4,7 and 14 actually 28 (that number)
		 */
		int sum = 0;
		int num = 7;
		int i = 1;
		while (i < num){
			if(num % i == 0)
				sum = sum + i;
				i++;
		}
	if(num < 0){
		System.out.println("Upisi pozitivan broj");
	}else if(sum == num){
		System.out.println("Broj je savrsen : " + sum + " = " + num  );
	}else{
		System.out.println("Broj nije savrsen : " + sum + " != " + num  );
	}
	}

}
