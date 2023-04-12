import java.util.Date;

public class TravelInsurance extends Insurance{
    private double distance;
    private double price;
    public TravelInsurance(String name, double price, Date startDate, Date endDate, int distance) {
        super(name, price, startDate, endDate);
        this.distance = distance;
    }

    @Override
    public double calculate() {
        return ( this.distance / 100);
    }
}
