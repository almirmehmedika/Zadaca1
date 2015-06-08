public class TaskOne {

	public static void main(String[] args) {
		// Program for construction triangle
		int page1 = 5;
		int page2 = 3;
		int page3 = 5;
		boolean condition1 = page1 > 0 && page2 > 0 && page3 > 0;
		boolean condition2 = page1 + page2 > page3 && page1 + page3 > page2
				&& page2 + page3 > page1;
		if (condition1 && condition2) {
			System.out.print("Moguæe je konstruisati trougao");
		} else {
			System.out.print("Nije moguæe konstruisati trougao");
		}
	}
}
