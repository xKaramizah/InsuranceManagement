import java.util.Date;

public class CarInsurance extends Insurance {
    private int age;

    public CarInsurance(double price, Date startDate, Date endDate, int age) {
        super("Car Insurance", price, startDate, endDate);
        this.age = age;
    }

    @Override
    public double calculate() {
        return this.age * 1.5;
    }
}
