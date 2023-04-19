import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public abstract class Account implements Comparable<Account> {
    AuthenticationStatus status;
    private User user;
    private String userType;
    private ArrayList<Insurance> insuranceList;
    protected Scanner scan = new Scanner(System.in);

    public Account(User user) {
        this.user = user;
        this.userType = userType;
        this.insuranceList = new ArrayList<>();
    }

    public final void showUserInfo() {
        System.out.println("User Information" +
                "\n- Name: " + this.user.getName() +
                "\n- Surname: " + this.user.getSurname() +
                "\n- Job: " + this.user.getJob() +
                "\n- Age: " + this.user.getAge() +
                "\n- E-mail: " + this.user.getEmail() +
                "\n- Last Login: " + this.user.getLastOnline());

        System.out.print("- Insurances: ");

        if (insuranceList.size() < 1) {
            System.out.println("There's no insurance policy");
        } else {
            System.out.println("\n------------------------------------------");
            for (Insurance insurance : insuranceList) {
                System.out.println("INSURANCE TYPE: " + insurance.getName() + "\t EXPIRY DATE: " + insurance.getExpireDate() + "\t PRICE: " + insurance.calculatePrice());
            }
            System.out.println("------------------------------------------");
        }
    }

    public void login(String email, String pass) throws InvalidAuthenticationException {

        if (this.user.getEmail().equalsIgnoreCase(email) && this.user.getPass().equals(pass)) {
            System.out.println("Login successfully");
            status = AuthenticationStatus.SUCCESS;
            this.user.setLastOnline(new Date());
        } else {
            status = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Invalid Authentication!");
        }
    }

    public abstract void addPolicy();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AuthenticationStatus getStatus() {
        return this.status;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void addNewInsurance(Insurance insurance) {
        this.insuranceList.add(insurance);
    }

    public ArrayList<Insurance> getInsuranceList() {
        return this.insuranceList;
    }

    public boolean isInsuranceExist(String type) {
        for (Insurance insurance : insuranceList) {
            if (insurance.getName().equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
