import java.time.LocalDate;

public abstract class Insurance {
    private static int idCounter = 0;
    private int id;
    private String name;
    private LocalDate startDate;

    public Insurance(String name, LocalDate startDate) {
        idCounter++;
        this.id = idCounter;
        this.name = name;
        this.startDate = startDate;
    }

    public abstract double calculatePrice();

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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public abstract LocalDate getExpireDate();

    public abstract void setExpireDate(int totalInsuranceTime);
}
