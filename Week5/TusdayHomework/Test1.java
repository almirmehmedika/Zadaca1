import java.util.ArrayList;

/**
 * @author
 *
 */
public class Test
{

    /**
     * @param args
     */
    public static void main(final String[] args)
    {
        final ArrayList<Employee> employees = new ArrayList<Employee>();

        final Employee employeeFirst = new Employee();
        employeeFirst.setName("Sam");
        employeeFirst.setGender("M");
        employeeFirst.setSalary(1200);
        employees.add(employeeFirst);

        final Employee employeeSecond = new Employee();
        employeeSecond.setName("Dean");
        employeeSecond.setGender("M");
        employeeSecond.setSalary(1300);
        employees.add(employeeSecond);

        final Employee director = new Employee();
        director.setName("Bobby");
        director.setGender("M");
        director.setSalary(1400);

        final Company company = new Company();
        company.setCompanyName("Javacomp");
        company.setDirector(director);
        company.setEmployees(employees);

        System.out.println(company.getNumOfEmployees());
        System.out.println(company.getNumOfFemaleEmployees());
        System.out.println(company.getSalaryBudgetValue());
        company.addSalaryIncrease(14);
        System.out.println(company.getSalaryBudgetValue());
        System.out.println(company);
    }

}
