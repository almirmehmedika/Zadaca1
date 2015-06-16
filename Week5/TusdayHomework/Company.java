
public class Company {
	private String companyName;
	private Employee director;
	private Employee[] employees;
	//Generating constructor
	public Company(String companyName, Employee director, Employee[] employees) {
		this.companyName = companyName;
		this.director = director;
		this.employees = employees;
	}
	/**
	 * Get number of employees in the company
	 * @return integer 
	 */
	public int getNumOfEmployees(){
		return employees.length;
	}
	/**
	 * Sum all salaries and get value of them 
	 * 	@return integer
	 */
	public int getSalaryBudgetValue(){
		int sum = 0;
		for(int i = 0; i < employees.length; i++){
			sum +=  employees[i].getSalary();
		}
	return sum;
	}
	/**
	 * Get number of female employees in the company
	 * @return integer
	 */
	public int getNumOfFemaleEmployees(){
		int counter = 0;
		for(int i = 0; i < employees.length; i++){
			if(employees[i].getGender().equals("Women")){
				counter++; 
			}
		}
		return counter;
	}
	/**
	 * Increase salary of all employees
	 * @param increase integer
	 */
	public void addSalaryIncrease(int increase){
		
		for(int i = 0; i < employees.length; i++){
			employees[i].setSalary(employees[i].getSalary() + increase);
		}
	}
	/**
	 * Print all information
	 */
	public String toString(){
	return	String.format("Company : %s\nDirector : %s \nNumber of employees : %d" , companyName, director.getName(), employees.length);
	}
	
}
