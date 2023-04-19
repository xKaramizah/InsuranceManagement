import java.time.LocalDate;

public class TravelInsurance extends Insurance {
    private double distance;
    private byte howManyDays;
    private LocalDate expireDate;

    public TravelInsurance(byte howManyDays, int distance) {
        super("Travel", LocalDate.now());
        this.howManyDays = howManyDays;
        this.distance = distance;
        this.setExpireDate(howManyDays);

    }

    @Override
    public double calculatePrice() {
        return (this.distance / 500 * this.howManyDays);
    }

    @Override
    public LocalDate getExpireDate() {
        return this.expireDate;
    }

    @Override
    public void setExpireDate(int totalInsuranceTime) {
        this.expireDate = this.getStartDate().plusDays(totalInsuranceTime);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public byte getHowManyDays() {
        return howManyDays;
    }

    public void setHowManyDays(byte howManyDays) {
        this.howManyDays = howManyDays;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

}
