public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){
        return collectPay() * 2;
    }

    @Override
    public double collectPay() {
        int workingHours = 9;
        return this.hourlyPayRate * workingHours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
