/**
 * @author
 *
 */
public class Employee
{
    private String name;
    private String gender;
    private int salary;

    /**
     * 
     */
    public Employee()
    {
        this(null, null, 0); // Mozes cak reci da npr, svaki novi ima gender = M
                             // tj, this(null, "M", 0); i ako se radi o zeni
                             // onda samo proslijediti Gender = W
    }

    // Generating constructor
    /**
     * @param name
     * @param gender
     * @param salary
     */
    private Employee(final String name, final String gender, final int salary)
    {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    // Generating getters

    /**
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name)
    {
        this.name = name;
    }

    /**
     * @param gender
     *            the gender to set
     */
    public void setGender(final String gender)
    {
        this.gender = gender;
    }

    /**
     * @return gender
     */
    public String getGender()
    {
        return gender;
    }

    /**
     * @return salary
     */
    public int getSalary()
    {
        return salary;
    }

    // Generating setters
    /**
     * @param salary
     */
    public void setSalary(final int salary)
    {
        this.salary = salary;
    }
}
