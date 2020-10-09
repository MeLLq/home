package praktika9;

public class Handler implements EmployeeHandler {
    private Company company;

    public Handler(Company company) {
        this.company = company;
    }

    @Override
    public void handle(Employee employee) {
        System.out.println(employee);
    }
}
