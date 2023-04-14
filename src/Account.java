import java.util.ArrayList;

public abstract class Account implements Comparable {
    AuthenticationStatus status;
    private User user;
    private ArrayList<Insurance> insurances;

    public Account(User user) {
        this.user = user;
    }

    public final void showUserInfo() {
        System.out.println("User Information" +
                "\n- Name: " + this.user.getName() +
                "\n- Surname: " + this.user.getSurname() +
                "\n- Job: " + this.user.getJob() +
                "\n- Age: " + this.user.getAge() +
                "\n- E-mail: " + this.user.getEmail());
    }

    public void login(String email, String pass) throws InvalidAuthenticationException {
        if (this.user.getEmail().equalsIgnoreCase(email) && this.user.getPass().equals(pass)) {
            System.out.println("Login successfully");
            status = AuthenticationStatus.SUCCESS;
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

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
