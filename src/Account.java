import java.util.ArrayList;

public abstract class Account {
    private AuthenticationStatus status = AuthenticationStatus.FAIL;
    private User user;
    private ArrayList<Insurance> insurances;

    public final void showUserInfo() {
        System.out.println("User Information\n" +
                "- Name: " + this.user.getName() +
                "- Surname: " + this.user.getSurname() +
                "- Job: " + this.user.getJob() +
                "- Age: " + this.user.getAge() +
                "- E-mail: " + this.user.getEmail() +
                "- Address: ");
    }

    public void login(String email, String pass) throws AbstractMethodError {
        try {
            if (this.user.getEmail().equalsIgnoreCase(email) && this.user.getPass().equals(pass)){
                System.out.println("Login successfully");
                status = AuthenticationStatus.SUCCESS;
            }
        } catch (AbstractMethodError error) {
            System.out.println("Access denied: " + error.getMessage());
            status = AuthenticationStatus.FAIL;
        }
    }


}
