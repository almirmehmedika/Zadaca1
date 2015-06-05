public class TaskFour {

	public static void main(String[] args) {
		// program which for certain date ordered zodiac sign
		int day = 10;
		int month = 11;
		boolean month1 = month > 0 && month <= 12;
		boolean jan = day > 0 && day <= 31;
		boolean feb = day > 0 && day <= 28;
		boolean mar = day > 0 && day <= 31;
		boolean apr = day > 0 && day <= 30;
		boolean may = day > 0 && day <= 31;
		boolean jun = day > 0 && day <= 30;
		boolean jul = day > 0 && day <= 31;
		boolean aug = day > 0 && day <= 31;
		boolean sep = day > 0 && day <= 30;
		boolean oct = day > 0 && day <= 31;
		boolean nov = day > 0 && day <= 30;
		boolean dec = day > 0 && day <= 31;
		boolean aries = (month == 3 && day >= 21) || (month == 4 && day <= 20);
		boolean taurus = (month == 4 && day >= 21) || (month == 5 && day <= 20);
		boolean gemini = (month == 5 && day >= 21) || (month == 6 && day <= 20);
		boolean cancer = (month == 6 && day >= 21) || (month == 7 && day <= 20);
		boolean leo = (month == 7 && day >= 21) || (month == 8 && day <= 21);
		boolean virgo = (month == 8 && day >= 22) || (month == 9 && day <= 22);
		boolean libra = (month == 9 && day >= 23) || (month == 10 && day <= 22);
		boolean scorpio = (month == 10 && day >= 23)
				|| (month == 11 && day <= 22);
		boolean sagittarius = (month == 11 && day >= 23)
				|| (month == 12 && day <= 21);
		boolean capricorn = (month == 12 && day >= 22)
				|| (month == 1 && day <= 20);
		boolean aquarius = (month == 1 && day >= 21)
				|| (month == 2 && day <= 19);
		boolean pisces = (month == 2 && day >= 20) || (month == 3 && day <= 20);
		if (month1 && jan && feb && mar && apr && may && jun && jul && aug && sep && oct
				&& nov && dec) {
			if (aries) {
				System.out.print("Ti si horoskopski znak : Ovan");
			} else if (taurus) {
				System.out.print("Ti si horoskopski znak : Bik");
			} else if (gemini) {
				System.out.print("Ti si horoskopski znak : Blizanci");
			} else if (cancer) {
				System.out.print("Ti si horoskopski znak : Rak");
			} else if (leo) {
				System.out.print("Ti si horoskopski znak : Lav");
			} else if (virgo) {
				System.out.print("Ti si horoskopski znak : Djevica");
			} else if (libra) {
				System.out.print("Ti si horoskopski znak : Vaga");
			} else if (scorpio) {
				System.out.print("Ti si horoskopski znak : Škorpija");
			} else if (sagittarius) {
				System.out.print("Ti si horoskopski znak : Strijelac");
			} else if (capricorn) {
				System.out.print("Ti si horoskopski znak : Jarac");
			} else if (aquarius) {
				System.out.print("Ti si horoskopski znak : Vodolija");
			} else if (pisces) {
				System.out.print("Ti si horoskopski znak : Riba");
			}

		} else {
			System.out.print("Pogresan datum");
		}

	}

}
