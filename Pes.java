
public class Pes {

	public static void main(String[] args) {
		
		FootballPlayer fp1 = new FootballPlayer("Christian Abbiati", 1977, "Goalkeeper");
		FootballPlayer fp2 = new FootballPlayer("Adil Rami", 1985, "Centre back");
		FootballPlayer fp3 = new FootballPlayer("Cristian Zapata", 1986, "Centre back");
		FootballPlayer fp4 = new FootballPlayer("Mattia De Sciglio", 1992, "Full back");
		FootballPlayer fp5 = new FootballPlayer("Philippe Mexes", 1982, "Cente back");
		FootballPlayer fp6 = new FootballPlayer("Nigel de Jong", 1984, "Defensive midfielder");
		FootballPlayer fp7 = new FootballPlayer("Marco van Ginkel", 1992, "Midfielder");
		FootballPlayer fp8 = new FootballPlayer("Andrea Poli", 1989, "Midfielder");
		FootballPlayer fp9 = new FootballPlayer("Keisuke Honda", 1986, "Forward");
		FootballPlayer fp10 = new FootballPlayer("Stephan El Shaarawy", 1992, "Forward");
		FootballPlayer fp11 = new FootballPlayer("Giampaolo Pazzini", 1984, "Forward");
	
		FootballTeam ft = new FootballTeam("A.C.Milan", new FootballPlayer[11] );
		ft.players[0] = fp1;
		ft.players[1] = fp2;
		ft.players[2] = fp3;
		ft.players[3] = fp4;
		ft.players[4] = fp5;
		ft.players[5] = fp6;
		ft.players[6] = fp7;
		ft.players[7] = fp8;
		ft.players[8] = fp9;
		ft.players[9] = fp10;
		ft.players[10] = fp11;
		
		System.out.println("Players with the same year of birth has : " + countPlayers(ft, 1984));
		System.out.println("Players with the same play position has : " + countPlayers(ft, "Forward"));
		System.out.println("Youngest player in the team : \n" + getYoungestPlayer(ft).nameOfPlayer);
	
	}
	/**
	 * Determines how many players are birth in the given year
	 * @param t - Football Team
	 * @param year - integer year
	 * @return integer 
	 */
	public static int countPlayers(FootballTeam t, int year){
		int counter = 0;
		for(int i = 0; i < t.players.length; i++ ){
			if(year == t.players[i].birthYear){
				counter++;
			}
		}
	return counter;
	}
	/**
	 * Determines how many players are play on the given position
	 * @param t - Football Team
	 * @param position - String player position
	 * @return integer
	 */
	public static int countPlayers(FootballTeam t, String position){
		int counter = 0;
		for(int i = 0; i < t.players.length; i++ ){
			if(position == t.players[i].playerPosition){
				counter++;
			}
		}
	return counter;
	}
	/**
	 * Finding youngest player in the team
	 * @param t - Football Team
	 * @return Football Player name
	 */
	public static FootballPlayer getYoungestPlayer(FootballTeam t){
		int youngest = t.players[0].birthYear;
		for(int i = 0; i < t.players.length; i++){
			if(youngest >= t.players[i].birthYear){
			}else{
				youngest = t.players[i].birthYear;
			}
		}
		for(int i = 0; i < t.players.length; i++){
			if(youngest == t.players[i].birthYear){
				return t.players[i];
			}
		}
		return null;
	}
}
