import java.time.LocalDate;

public class ResidenceInsurance extends Insurance {
    private double area;
    private int estimatedValue;
    private LocalDate expireDate;

    public ResidenceInsurance(int area, int estimatedValue) {
        super("Residence", LocalDate.now());
        this.area = area;
        this.estimatedValue = estimatedValue;
        this.setExpireDate(360);
    }

    @Override
    public double calculatePrice() {
        return this.area * 2;
    }

    @Override
    public LocalDate getExpireDate() {
        return this.expireDate;
    }

    @Override
    public void setExpireDate(int totalInsuranceTime) {
        this.expireDate = this.getStartDate().plusDays(totalInsuranceTime);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(int estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

}
