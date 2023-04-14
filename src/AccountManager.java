import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> userAccounts;

    public AccountManager() {
        this.userAccounts = new TreeSet<>();
        ;
        initializeUsers();
    }

    public void initializeUsers() {

        User u1 = new User("Individual", "IndTest", "Test", "test", "test", "Retired", 69);
        User u2 = new User("Individual", "TestInd", "Test", "test2@test.com", "222", "Student", 18);
        User u3 = new User("Enterprise", "Ent Prise", "Man", "test3@test.com", "333", "Salesman", 24);
        User u4 = new User("Enterprise", "Enterprise", "Man", "test4@test.com", "444", "Salesman", 55);

        userAccounts.add(new Individual(u1));
        userAccounts.add(new Individual(u2));
        userAccounts.add(new Enterprise(u3));
        userAccounts.add(new Enterprise(u4));
    }

    public Account login(String email, String pass) {
        try {
            for (Account acc : userAccounts) {
                acc.login(email, pass);
                if (acc.status.equals(AuthenticationStatus.SUCCESS)) {
                    return acc;
                }
            }
        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
