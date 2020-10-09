package praktika9;

public class SalarySelect implements SelectEmployee {
    private double min_salary;

    public SalarySelect(double min_salary) {
        this.min_salary = min_salary;
    }

    @Override
    public boolean selection(Employee employee) {
        return employee.salary > min_salary;
    }

}
