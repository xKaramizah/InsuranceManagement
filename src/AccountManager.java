import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> userAccounts;

    public AccountManager() {
        this.userAccounts = new TreeSet<>();

        initializeUsers();
    }

    public void initializeUsers() {

        User u1 = new User("Individual", "Mr", "Brown", "test", "test", "Retired", 69);
        User u2 = new User("Individual", "Mrs", "Brown", "test2@test.com", "222", "Student", 18);
        User u3 = new User("Enterprise", "Mr.", "Blue", "test1", "test1", "Salesman", 24);
        User u4 = new User("Enterprise", "Mrs.", "Blue", "test4@test.com", "444", "Salesman", 55);

        userAccounts.add(new Individual(u1));
        userAccounts.add(new Individual(u2));
        userAccounts.add(new Enterprise(u3));
        userAccounts.add(new Enterprise(u4));
    }

    public Account login(String email, String pass) {
        for (Account acc : userAccounts) {
            if (acc.getUser().getEmail().equals(email) && acc.getUser().getPass().equals(pass)) {
                try {
                    acc.login(email, pass);
                    if (acc.getStatus().equals(AuthenticationStatus.SUCCESS)) {
                        return acc;
                    }
                } catch (InvalidAuthenticationException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Invalid Authentication!");
        return null;
    }
}
