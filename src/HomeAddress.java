public class HomeAddress implements IAddress {
    private String type;
    private String street;
    private String city;
    private int postcode;

    public HomeAddress(String street, String city, int postcode) {
        this.type = "Home";
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    @Override
    public void printAddressInfo() {
        System.out.println("Address type: " + this.type +
                "\nAddress: " + this.street + ", " + this.city + ", " + this.postcode);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int getPostCode() {
        return this.postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }
}
