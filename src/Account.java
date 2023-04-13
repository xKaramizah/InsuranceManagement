import java.util.ArrayList;

public abstract class Account implements Comparable {
    private AuthenticationStatus status = AuthenticationStatus.FAIL;
    private User user;
    private ArrayList<Insurance> insurances;

    public final void showUserInfo() {
        System.out.println("User Information\n" +
                "- Name: " + this.user.getName() +
                "- Surname: " + this.user.getSurname() +
                "- Job: " + this.user.getJob() +
                "- Age: " + this.user.getAge() +
                "- E-mail: " + this.user.getEmail());
    }

    public void login(String email, String pass) throws InvalidAuthenticationException {
        try {
            if (this.user.getEmail().equalsIgnoreCase(email) && this.user.getPass().equals(pass)) {
                System.out.println("Login successfully");
                status = AuthenticationStatus.SUCCESS;
            } else {
                status = AuthenticationStatus.FAIL;
                throw new InvalidAuthenticationException("Invalid Authentication!");
            }

        } catch (InvalidAuthenticationException error) {
            System.out.println("Access denied: " + error.getMessage());
        }
    }

    public abstract void addPolicy();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
