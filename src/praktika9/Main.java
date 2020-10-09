package praktika9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Random r = new Random();
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(20000 + r.nextInt(40000));
            company.hire(employees[i]);
        }

        SalarySelect salarySelector = new SalarySelect(30000);
        Handler printHandler = new Handler(company);
        company.HandleEmployees(salarySelector, printHandler);
        System.out.println();
        company.HandleEmployees(new SelectEmployee() {
            @Override
            public boolean selection(Employee emp) {
                return emp.salary > 50000;
            }
        }, new EmployeeHandler() {
            @Override
            public void handle(Employee emp) {
                System.out.println(emp);
            }
        });
        System.out.println();
        company.HandleEmployees((emp) -> emp.salary > 20000, (emp) -> System.out.println(emp));
    }
}

