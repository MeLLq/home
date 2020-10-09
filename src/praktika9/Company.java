package praktika9;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final ArrayList<Employee> employees = new ArrayList<>();
    public void hire(Employee emp){
        if (!(employees.contains(emp))) {
            employees.add(emp);
        }
        else System.out.println("praktika9.Company already has " + emp);
    }

    public void hireAll(List<Employee> newEmps){
        for (int i = 0; i < newEmps.size(); i++){
            this.hire(newEmps.get(i));
        }
    }

    public void fire(Employee emp){
        if (employees.contains(emp)) {
            employees.remove(emp);
        }
        else System.out.println("praktika9.Company hasn't " + emp);
    }

    public void HandleEmployees(SelectEmployee selector, EmployeeHandler handler){ ;
        for (Employee emp: employees) {
            if(selector.selection(emp)){
                handler.handle(emp);
            }
        }
    }
    @Override
    public String toString() {
        return "praktika9.Company{" +
                "employees=" + employees +
                '}';
    }
}
