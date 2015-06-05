
public class TaskSeven {

	public static void main(String[] args) {
		// Program for calculating sum of its digits for four-digit number
		int var = 4731;
		boolean var1 = var >=1000 && var < 9999;
		int mod1 = var % 10;
		int div1 = var / 10;
		int mod2 = div1 % 10;
		int div2 = div1 / 10;
		int mod3 = div2 % 10;
		int div3 = div2 / 10;
		int sum = mod1 + mod2 + mod3 + div3;
		if(var1){
			System.out.print(div3 + "+" + mod3 + "+" + mod2 + "+" + mod1 + "=" + sum);
		}else{
			System.out.print("Upiši èetverocifren broj");
		}
	}

}
