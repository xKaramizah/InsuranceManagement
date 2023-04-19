import java.time.LocalDate;

public class CarInsurance extends Insurance {
    private int carAge;
    private double estimatedValue;
    private LocalDate expireDate;

    public CarInsurance(int carAge, double estimatedValue) {
        super("Car", LocalDate.now());
        this.carAge = carAge;
        this.estimatedValue = estimatedValue;
        this.setExpireDate(360);
    }

    @Override
    public double calculatePrice() {
        return this.getCarAge() * 1.5 + this.getEstimatedValue() / 100;
    }

    @Override
    public LocalDate getExpireDate() {
        return this.expireDate;
    }

    @Override
    public void setExpireDate(int totalInsuranceTime) {
        this.expireDate = this.getStartDate().plusDays(totalInsuranceTime);
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(int estimatedValue) {
        this.estimatedValue = estimatedValue;
    }
}
