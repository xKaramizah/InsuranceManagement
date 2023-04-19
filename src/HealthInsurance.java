import java.time.LocalDate;

public class HealthInsurance extends Insurance {
    private int age;
    private LocalDate expireDate;

    public HealthInsurance(int age) {
        super("Health", LocalDate.now());
        this.age = age;
        this.setExpireDate(360);
    }

    @Override
    public double calculatePrice() {
        return this.age * 4;
    }

    @Override
    public LocalDate getExpireDate() {
        return this.expireDate;
    }

    @Override
    public void setExpireDate(int totalInsuranceTime) {
        this.expireDate = this.getStartDate().plusDays(totalInsuranceTime);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

}
