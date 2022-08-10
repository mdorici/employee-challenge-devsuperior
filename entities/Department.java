package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Integer payDay;

    private Address address;
    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setPayDay(Integer payDay) {
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double payroll() {
        double sum = 0.0;
        for(Employee emp : employees) {
            sum += emp.getSalary();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department ");
        sb.append(name);
        sb.append(" = R$ ");
        sb.append(String.format("%.2f \n", payroll()));
        sb.append("Pay Day ");
        sb.append(payDay + "\n");
        sb.append("Employees: \n");
        for(Employee employee : employees) {
            sb.append(employee.getName() + "\n");
        }
        sb.append("For questions, please contact: ");
        sb.append(getAddress().getEmail());
        return sb.toString();
    }
}
