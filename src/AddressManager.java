import java.util.Scanner;

public class AddressManager {

    public static void addAddress(User user) {
        Scanner scan = new Scanner(System.in);
        System.out.print("""
                1- Add home address
                2- Add business address
                0- Back to main manu
                                
                Selection: """);

        byte choice = scan.nextByte();
        while (choice < 0 || choice > 2) {
            System.out.print("Invalid selection. Select again: ");
            choice = scan.nextByte();
        }
        switch (choice) {
            case 1 -> {
                try {
                    System.out.println("# Add your home address details #");
                    System.out.print("Street: ");
                    String homeStreet = scan.next();
                    System.out.print("City: ");
                    String homeCity = scan.next();
                    System.out.print("Post Code: ");
                    int homePostCode = scan.nextInt();
                    user.getAddressList().add(new HomeAddress(homeStreet, homeCity, homePostCode));

                } catch (Exception e) {
                    System.out.println("Error adding address: " + e.getMessage());
                }
                System.out.println("Home address successfully added");
            }
            case 2 -> {
                try {
                    System.out.println("# Add your business address details #");
                    System.out.print("Street: ");
                    String street = scan.next();
                    System.out.print("City: ");
                    String city = scan.next();
                    System.out.print("Post Code: ");
                    int postCode = scan.nextInt();
                    user.getAddressList().add(new BusinessAddress(street, city, postCode));

                } catch (Exception e) {
                    System.out.println("Error adding address: " + e.getMessage());
                }
                System.out.println("Business address successfully added");
            }
            case 0 -> System.out.println("Returning to main menu.");
        }
    }

    public static void removeAddress(User user) {
        Scanner scan = new Scanner(System.in);
        System.out.print("""
                1- Remove home address
                2- Remove business address
                0- Back to main manu
                                
                Selection: """);

        byte choice = scan.nextByte();
        while (choice < 0 || choice > 2) {
            System.out.print("Invalid selection. Select again: ");
            choice = scan.nextByte();
        }
        switch (choice) {
            case 1 -> {
                try {
                    for (int i = user.getAddressList().size() - 1; i >= 0; i--) {
                        if (user.getAddressList().get(i) instanceof HomeAddress) {
                            user.getAddressList().remove(i);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error removing address: " + e.getMessage());
                }
                System.out.println("Home address successfully removed");
            }
            case 2 -> {
                try {
                    for (int i = user.getAddressList().size() - 1; i >= 0; i--) {
                        if (user.getAddressList().get(i) instanceof BusinessAddress) {
                            user.getAddressList().remove(i);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error removing address: " + e.getMessage());
                }
                System.out.println("Business address successfully removed");
            }
            case 0 -> System.out.println("Returning to main menu.");
        }
    }
}