package praktika9;

import java.time.LocalDate;

public class Employee {
    public String name, surname, address, phone_number;
    public double salary;
    public LocalDate birthday;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", salary=" + salary;
    }

}
