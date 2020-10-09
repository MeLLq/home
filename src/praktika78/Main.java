package praktika78;

import java.util.ArrayList;
import java.util.List;

interface EmployeePosition {
    String getJobTitle();

    double getSalary();

    double calcSalary(double baseSalary);
}

class Employee {
    public double fxsalary;
    public String name, surname;
    public EmployeePosition position;

    public double calcSalary() {
        return position.calcSalary(fxsalary);
    }

    public Employee(EmployeePosition position, double fxsalary) {
        this.position = position;
        this.fxsalary = fxsalary;
    }

}

class Manager implements EmployeePosition {
    Company company;
    private final double income;

    public Manager(Company company) {
        income = (115_000 + Math.random() * 150_000);
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double salary) {
        return salary + 0.05 * income;
    }

    @Override
    public double getSalary() {
        return income;
    }
}

class TopManager implements EmployeePosition {
    Company company;
    double income;

    public TopManager(Company company) {
        this.company = company;
        income = (200_000 + Math.random() * 350_000);
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }


    @Override
    public double calcSalary(double salary) {
        if (company.getIncome() >= 10000000) {
            return salary + 1.5 * income;
        } else return salary;
    }

    @Override
    public double getSalary() {
        return income;
    }
}

class Operator implements EmployeePosition {
    double income;
    Company company;

    public Operator(Company company) {
        this.company = company;
        income = (20_000 + Math.random() * 50_000);
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double salary) {
        return salary;
    }

    @Override
    public double getSalary() {
        return income;
    }
}

class Company {
    public int income;
    final private ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<Employee>();
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(ArrayList<Employee> employee) {
        employee.addAll(employee);
    }

    public void fire(int number) {
        if (number > -1 && number < employees.size()) {
            employees.remove(number);
        }
    }

    public int getSize() {
        return employees.size();
    }

    public int getIncome() {
        income = 0;
        for (Employee person : employees) {
            income += person.position.getSalary();
        }
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1 - i; j++) {
                if (employees.get(j).calcSalary() < employees.get(j + 1).calcSalary()) {
                    Employee t;
                    t = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, t);
                }

            }
        }
        List<Employee> topSalary = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            topSalary.add(employees.get(i));
        }
        return topSalary;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1 - i; j++) {
                if (employees.get(j).calcSalary() > employees.get(j + 1).calcSalary()) {
                    Employee t;
                    t = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, t);
                }

            }
        }

        List<Employee> lowerSalary = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            lowerSalary.add(employees.get(i));
        }
        return lowerSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        for (int i = 0; i < 180; i++) {
            Employee employee = new Employee(new Operator(company), 20000);
            company.hire(employee);
        }
        for (int i = 0; i < 80; i++) {
            Employee employee = new Employee(new Manager(company), 40000);
            company.hire(employee);
        }


        ArrayList<Employee> topManager = new ArrayList<Employee>();

        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee(new TopManager(company), 50_000);
            topManager.add(employee);
        }
        company.hireAll(topManager);


        List<Employee> topSalary = company.getTopSalaryStaff(13);
        for (Employee obj : topSalary) {
            System.out.printf("%d Руб \n", (int) obj.calcSalary());
        }

        List<Employee> lowerSalary = company.getLowestSalaryStaff(30);
        for (Employee obj : lowerSalary) {
            System.out.printf("%d Руб \n", (int) obj.calcSalary());
        }

        System.out.println(company.getSize() + " Размер до увольнения");

        int len = company.getSize() / 2;
        for (int i = 0; i < len; i++) {
            int index = (int) (Math.random() * company.getSize());

            company.fire(index);
        }

        System.out.println(company.getSize() + " Размер после увольнения");

        topSalary = company.getTopSalaryStaff(10);
        for (Employee obj : topSalary) {
            System.out.printf("%d Руб \n", (int) obj.calcSalary());
        }

        lowerSalary = company.getLowestSalaryStaff(30);
        for (Employee obj : lowerSalary) {
            System.out.printf("%d Руб \n", (int) obj.calcSalary());
        }
    }
}


