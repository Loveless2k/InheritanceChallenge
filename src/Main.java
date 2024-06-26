public class Main {
    public static void main(String[] args) {
        Employee jorge = new Employee("Jorge", "10/06/1986", "01/01/2024");
        System.out.println(jorge);
        System.out.println("Age = " + jorge.getAge());
        System.out.println("Pay = " + jorge.collectPay());
        jorge.terminate("01/05/2024");
        System.out.println(jorge);

        SalariedEmployee tebanz = new SalariedEmployee("Esteban", "13/02/1989", "02/02/2024",
                8_000_000d, false);
        System.out.println(tebanz);
        System.out.println("Age = " + tebanz.getAge());
        System.out.println("Tebanz's Paycheck = $" + tebanz.collectPay());
        tebanz.retire();
        System.out.println("Tebanz's Pension Paycheck = $" + tebanz.collectPay());
        System.out.println(tebanz);

        HourlyEmployee camila = new HourlyEmployee("Camila", "01/08/1994", "01/01/2024", 2000.0);
        System.out.println(camila);
        System.out.println("Age = " + camila.getAge());
        System.out.println("Camila's Paycheck = $" + camila.collectPay());
        System.out.println("Camila's Holiday Pay = $" + camila.getDoublePay());
    }
}
