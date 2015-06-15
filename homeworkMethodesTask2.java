
public class homeworkMethodesTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = getGrade(10);
		System.out.println(grade);
	}
	
	public static char getGrade(int score){
		
		switch(score/10){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				return'F';
			case 5:
				return(score % 10 <= 4)?'F':'E';
			case 6:
				return(score % 10 <= 3)?'E':'D';
			case 7:
				return(score % 10 <= 3)?'D':'C';
			case 8:
				return(score % 10 <= 3)?'C':'B';
			case 9:
				return(score % 10 <= 3)?'B':'A';
			default:
				return'A';
		}
		
	}
	
}
