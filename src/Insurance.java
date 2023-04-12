import java.util.Date;

public abstract class Insurance {
    private static int idCounter = 0;
    private int id;
    private String name;
    private double price;
    private Date startDate;
    private Date endDate;

    public Insurance(String name, double price, Date startDate, Date endDate) {
        idCounter++;
        this.id = idCounter;
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract double calculate();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
