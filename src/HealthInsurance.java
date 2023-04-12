import java.util.Date;

public class HealthInsurance extends Insurance {
    private int age;

    public HealthInsurance(double price, Date startDate, Date endDate, int age) {
        super("Health Insurance", price, startDate, endDate);
        this.age = age;
    }

    @Override
    public double calculate() {
        return this.age * 4;
    }
}
