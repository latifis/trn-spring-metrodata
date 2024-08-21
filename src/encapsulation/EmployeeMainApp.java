package encapsulation;

public class EmployeeMainApp {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("latif");
        emp.setSalary(2000);

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}
