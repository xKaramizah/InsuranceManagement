import java.util.ArrayList;
import java.util.Date;

public class User {
    private static int idCounter = 0;
    private int id;
    private String clientType;
    private String name;
    private String surname;
    private String email;
    private String pass;
    private String job;
    private int age;
    private ArrayList<IAddress> addressList;
    private Date lastOnline;

    public User(String clientType, String name, String surname, String email, String pass, String job, int age) {
        idCounter++;
        this.id = idCounter;
        this.clientType = clientType;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.pass = pass;
        this.job = job;
        this.age = age;
        this.addressList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getClientType() {
        return clientType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public ArrayList<IAddress> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<IAddress> addresses) {
        this.addressList = addresses;
    }

    public Date getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(Date lastOnline) {
        this.lastOnline = lastOnline;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
