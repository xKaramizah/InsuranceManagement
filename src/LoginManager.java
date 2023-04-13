import java.util.Scanner;

public class LoginManager {
    public void login(){
        Scanner scan = new Scanner(System.in);

        User u1 = new User("Individual","Test", "Man", "test@test.com", "123", "Retired", 69);

        System.out.print("""
                === INSURANCE MANAGEMENT CONSOLE === 
                
                1- User Login
                2- Register as new user
                0- Leave console
                
                Selection : """);

        byte choice = scan.nextByte();
        while (choice < 0 || choice > 2){
            System.out.print("Invalid selection. Try again: ");
            choice = scan.nextByte();
        }
        switch (choice){
            case 1:
                break;
            case 2:
                break;
            case 0:
                System.out.println("Have a nice day.");
        }
    }
}
