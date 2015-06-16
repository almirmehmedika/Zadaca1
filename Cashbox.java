
public class Cashbox {
	private String name;
	private int currentcash;
	
	public Cashbox(String name){
		this.name = name;	
	}
	public void addMoney(int cash){
		this.currentcash += cash;
	}
	public void clearCashbox(){
		this.currentcash = 0;
	}
	public void printInformation(){
		if(this.currentcash == 0){
			System.out.println("It is empty ");
		}else if(this.currentcash > 0 && this.currentcash < 21){
			System.out.println("There's some, but not much.");
		}else if(this.currentcash > 20 && this.currentcash < 101){
			System.out.println("There's some.");
		}else{
			System.out.println("There's a lot.");
		}
	}
}

