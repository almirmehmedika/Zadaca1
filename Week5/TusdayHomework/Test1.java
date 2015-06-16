


public class Test1 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Sam", "Man", 1200);
		Employee e2 = new Employee("Dean", "Man", 1300);
		Employee e3 = new Employee("Bobby", "Man", 1400);
		
		Company c1 = new Company("Javacomp", e3 , new Employee[]{e1,e2});
		
		System.out.println(c1.getNumOfEmployees());
		System.out.println(c1.getNumOfFemaleEmployees());
		System.out.println(c1.getSalaryBudgetValue());
		c1.addSalaryIncrease(14);
		System.out.println(c1.getSalaryBudgetValue());
		System.out.println(c1);
	}

}
