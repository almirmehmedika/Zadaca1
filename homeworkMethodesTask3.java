public class homeworkMethodesTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = hasNumber("inde1f");
		System.out.println(b);
	}

	public static boolean hasNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				return true;
			}
		}
		return false;
		
	}
}
