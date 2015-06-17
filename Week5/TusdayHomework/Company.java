
import java.util.ArrayList;

/**
 * @author
 *
 */
public class Company
{
    private String companyName;
    private Employee director;
    private ArrayList<Employee> employees;

    /**
     * @param companyName
     * @param director
     * @param employees
     */
    public Company()
    {
        this(null, null, new ArrayList<Employee>());
    }

    /**
     * @param companyName
     * @param director
     * @param employees
     */
    // Generating constructor
    private Company(final String companyName, final Employee director, final ArrayList<Employee> employees)
    {
        this.companyName = companyName;
        this.director = director;
        this.employees = employees;
    }

    /**
     * Get number of employees in the company
     * 
     * @return integer
     */
    public int getNumOfEmployees()
    {
        return employees.size();
    }

    /**
     * Sum all salaries and get value of them
     * 
     * @return integer
     */
    public int getSalaryBudgetValue()
    {
        int sum = 0;
        for (final Employee employee : employees)
        {
            sum += employee.getSalary();
        }
        return sum;
    }

    /**
     * Get number of female employees in the company
     * 
     * @return integer
     */
    public int getNumOfFemaleEmployees()
    {
        int counter = 0;
        // Koristiti for each jer na ovaj nacin cak ako predas praznu listu kod
        // ce preskociti izvravanje i nemas potrebe za dodatnim varijablama
        for (final Employee employee : employees)
        {
            // Java logika kaze da predefinisani string u tvom slucaju "Woman"
            // nikada nemoze biti null i da se on treba porediti sa vrijednoscu
            // property-ija u objektu
            // Na ovaj nacin si siguran da kod nece pasti
            if (("W").equals(employee.getGender()))
                counter++;
        }
        return counter;
    }

    /**
     * Increase salary of all employees
     * 
     * @param increase
     *            integer
     */
    public void addSalaryIncrease(final int increase)
    {
        for (final Employee employee : employees)
        {
            employee.setSalary(employee.getSalary() + increase);
        }
    }

    // Ako nisi znao imas opciju da na eclipse-u kliknes desno dugme --> Source
    // --> Generate toString()...
    // Takodjer pod opcijom Source imas i generisanje geter-a, set-era,
    // Construct-ora,....

    /**
     * Print all information
     */
    @Override
    public String toString()
    {
        return String.format("Company : %s\nDirector : %s \nNumber of employees : %d", companyName, director.getName(), employees.size());
    }

    /**
     * @return the companyName
     */
    public String getCompanyName()
    {
        return companyName;
    }

    /**
     * @param companyName
     *            the companyName to set
     */
    public void setCompanyName(final String companyName)
    {
        this.companyName = companyName;
    }

    /**
     * @return the director
     */
    public Employee getDirector()
    {
        return director;
    }

    /**
     * @param director
     *            the director to set
     */
    public void setDirector(final Employee director)
    {
        this.director = director;
    }

    /**
     * @return the employees
     */
    public ArrayList<Employee> getEmployees()
    {
        return employees;
    }

    /**
     * @param employees
     *            the employees to set
     */
    public void setEmployees(final ArrayList<Employee> employees)
    {
        this.employees = employees;
    }

}
