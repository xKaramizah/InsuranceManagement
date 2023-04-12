import java.util.Date;

public class ResidenceInsurance extends Insurance {
    private double area;

    public ResidenceInsurance(double price, Date startDate, Date endDate, int area) {
        super("Residence Insurance", price, startDate, endDate);
        this.area = area;
    }

    @Override
    public double calculate() {
        return this.area * 2;
    }
}
