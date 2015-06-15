
public class SchoolTasks {

	public static void main(String[] args) {
		Classroom c1 = new Classroom("I", 25);
		Classroom c2 = new Classroom("II", 21);
		Classroom c3 = new Classroom("III", 19);
		Classroom c4 = new Classroom("IV", 14);
		Classroom c5 = new Classroom("V", 16);
		Classroom c6 = new Classroom("VI", 30);
		Classroom c7 = new Classroom("VII", 9);
		Classroom c8 = new Classroom("VIII", 2);
		
		Director d1 = new Director("Hamdo", 1912);
		Director d2 = new Director("Dzevad", 1899);
		
		School s1 = new School("Basic School", d1 , new Classroom[4]);
		s1.classroom[0] = c1;
		s1.classroom[1] = c2;
		s1.classroom[2] = c3;
		s1.classroom[3] = c4;
		
		School s2 = new School("Advanced School", d2 , new Classroom[4]);
		s2.classroom[0] = c5;
		s2.classroom[1] = c6;
		s2.classroom[2] = c7;
		s2.classroom[3] = c8;
		
		System.out.println("Classroom with the most students is : " + getNameOfClassWithTheMostStudents(s2));
		System.out.println("School with the youngest director is : " + getSchoolWithYoungestDirector(new School []{s1,s2}).name);
		System.out.println("School with more students is : " + getNameOfSchoolWithMoreStudents(s1, s2));
	}
	/**
	 * Count which classroom have most students and print on the console name of that classroom
	 * @param s - School
	 * @return String name of classroom
	 */
	public static String getNameOfClassWithTheMostStudents(School s){
		int max = s.classroom[0].numOfStudents;
		for(int i = 0; i < s.classroom.length; i++){
			if(s.classroom[i].numOfStudents > max){
				max = s.classroom[i].numOfStudents;
			}
		}
		for(int i = 0; i < s.classroom.length; i++){
			if(s.classroom[i].numOfStudents == max){
				return s.classroom[i].name;
			}
		}
		return null;
	}
	/**
	 * Find school with youngest director and print her name on the console
	 * @param schools - array of schools
	 * @return school name
	 */
	public static School getSchoolWithYoungestDirector(School[] schools){
		int youngest = schools[0].director.yearOfBirth;
		for(int i = 0; i < schools.length; i++){
			if(youngest <= schools[i].director.yearOfBirth){
				youngest = schools[i].director.yearOfBirth;
			}
		}
		for(int i = 0; i < schools.length; i++){
			if(youngest == schools[i].director.yearOfBirth){
				return schools[i];
			}
		}
		return null;
	}
	/**
	 * Return name of the school with more students
	 * @param s1 - School
	 * @param s2 - School
	 * @return string name of school
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2){
		int sumSchool1 = sumOfStudents(s1);
		int sumSchool2 = sumOfStudents(s2);
		return (sumSchool1 > sumSchool2)? s1.name:s2.name;	
	}
	/**
	 * Calculating sum of all students from one school
	 * @param s - School
	 * @return integer sum of students
	 */
	public static int sumOfStudents(School s){
		int sum = 0;
		for(int i = 0; i < s.classroom.length; i++){
			sum += s.classroom[i].numOfStudents;
		}
		return sum;
	}
}
