public class BusinessAddress implements IAddress {
    private String type;
    private String street;
    private String city;
    private int postcode;

    public BusinessAddress(String street, String city, int postcode) {
        this.type = "Business";
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    @Override
    public void printAddressInfo() {
        System.out.println("Address type: " + this.type +
                "\nAddress: " + this.street + ", " + this.city + ", " + this.postcode);
    }

    public String getInsuranceType() {
        return type;
    }

    public void setInsuranceType(String insuranceType) {
        this.type = insuranceType;
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
