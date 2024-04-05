public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int EMPLOYEENO = 1;

    public Employee() {
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.EMPLOYEENO++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
