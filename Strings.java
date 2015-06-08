
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input first String: ");
		String s1 = in.next();
		System.out.println("Input second String: ");
		String s2 = in.next();
		firstLetterSecondLetter(s1, s2);
		boolean b = lettersFromFirstAreInSecond(s1, s2);
		System.out.println(b);
		String s = stringComesSecond(s1, s2);
		System.out.println(s);
		boolean truth = areAnagrams(s1,s2);
		System.out.println(truth);
		in.close();
	}

	public static void firstLetterSecondLetter(String s1, String s2) {
		// Write a method that prints ( not returns ) on console first letter
		// first
		// first letter second, second letter first etc...
		String s3;
		String s4 = "";
		String s5;
		// Put in s3 string which have less letters
		s3 = (s1.length() < s2.length()) ? s1 : s2;
		// Put in s5 string which have more letters
		s5 = (s1.length() > s2.length()) ? s1 : s2;
		// Add to s4 first letter first, first letter second....
		// When all letters of string with less letters are added to s4, break
		// the loop
		for (int i = 0; i < s3.length(); i++) {
			s4 += "" + s1.charAt(i) + s2.charAt(i);
		}
		// Put in s6 rest of letters from string with more letters which didn't
		// added
		// to s4
		String s6 = s5.substring(s3.length(), s5.length());
		String s7 = s4 + s6;
		System.out.println(s7);

	}

	public static boolean lettersFromFirstAreInSecond(String s1, String s2) {
		// Write a method that determines whether all the letters from first
		// string
		// appear in second

		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		// Look at where in the second string is character i from the first
		// string
		// If the result is -1, return false
		for (int i = 0; i < s3.length(); i++) {
			if (s4.indexOf(s3.charAt(i)) == -1)
				return false;
		}
		return true;

	}

	public static String stringComesSecond(String s1, String s2) {
		// Write a method that prints the string comes second in alphabetical
		// order
		// if difference between etc. Z(90 in ASCII) - K(75 in ASCII) > 0, Z
		// comes second
		// else K comes second which is not case in this example
		if (s1.compareToIgnoreCase(s2) > 0) {
			return s1;
		} else {
			return s2;
		}

	}

	public static boolean areAnagrams(String s1, String s2) {
		int counter = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					counter++;
				}
			}
		}
		if (counter == s1.length()) {
			return true;
		} else {
			return false;
		}

	}
			
		}


	

