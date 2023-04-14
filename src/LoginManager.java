import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginManager {
    protected Scanner scan = new Scanner(System.in);

    public void login() {

        System.out.print("""
                === INSURANCE MANAGEMENT CONSOLE ===
                ------------------------------------
                1- User Login
                2- Register as new user
                0- Leave console
                ------------------------------------
                Selection:""");
        byte choice = 0;
        try {
            choice = scan.nextByte();
            while (choice < 0 || choice > 2) {
                System.out.print("Invalid selection. Try again: ");
                choice = scan.nextByte();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch");
        }

        switch (choice) {
            case 1 -> {
                AccountManager accountManager = new AccountManager();
                System.out.print("Enter your email: ");
                String email = scan.next();
                System.out.print("Enter your password: ");
                String pass = scan.next();
                Account account = accountManager.login(email, pass);
                if (account != null) {
                    userMenu(account);
                }
            }
            case 2 -> System.out.println("This section will be available soon");
            case 0 -> System.out.println("Have a nice day.");
        }
    }

    public void userMenu(Account account) {
        System.out.println(" === Mr./Mrs. " + account.getUser().getSurname() + " WELCOME ===");
        System.out.print("""
                ---------------------------------
                :: USER MENU ::
                ---------------------------------
                1- Get user information
                2- Buy new insurance policy
                3- Manage addresses
                0- Leave menu
                ---------------------------------
                Selection:""");

        byte choice = 0;
        try {
            choice = scan.nextByte();
            while (choice < 0 || choice > 3) {
                System.out.print("Invalid selection. Try again: ");
                choice = scan.nextByte();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch");
        }

        switch (choice){
            case 1:
                account.showUserInfo();
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                System.out.println("Have a nice day.");
                break;
        }
    }

}
