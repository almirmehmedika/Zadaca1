
public class Employee {
	private String name;
	private String gender;
	private int salary;
	
	//Generating constructor
	public Employee(String n, String g, int s) {
		name = n;
		gender = g;
		salary = s;
	}
	//Generating getters
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}
	// Generating setters
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
