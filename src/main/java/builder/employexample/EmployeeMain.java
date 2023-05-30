package builder.employexample;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee.EmployeeBuilder()
                .empNo(100)
                .name("Alex")
                .projectName("Builder pattern").builder();

        System.out.println(emp1);
    }
}
