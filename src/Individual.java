public class Individual extends Account {
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addPolicy() {
        boolean onPolicyMenu = true;

        while (onPolicyMenu) {
            System.out.println("=== Insurance Policies for Individual Customers ===");
            System.out.print("""
                    1- Health Insurance
                    2- Residence Insurance
                    3- Travel Insurance
                    4- Car Insurance
                    0- Back to previous menu
                                    
                    Selection : """);

            byte choice = scan.nextByte();
            System.out.println();

            while (choice < 0 || choice > 4) {
                System.out.println("Invalid selection. Try again!");
                choice = scan.nextByte();
            }
            switch (choice) {
                case 1:
                    if (this.isInsuranceExist("Health")) {
                        System.out.println("Health Insurance already exist.");
                    } else {
                        this.addNewInsurance(new HealthInsurance(getUser().getAge()));
                        System.out.println("New health insurance added to your policies");
                    }
                    break;

                case 2:
                    if (this.isInsuranceExist("Residence")) {
                        System.out.println("Residence Insurance already exist.");
                    } else {
                        this.addNewInsurance(new ResidenceInsurance(100, 100000));
                        System.out.println("New Residence insurance added to your policies");
                    }
                    break;

                case 3:
                    if (this.isInsuranceExist("Travel")) {
                        System.out.println("Travel Insurance already exist.");
                    } else {
                        this.addNewInsurance(new TravelInsurance((byte) 12, 1000));
                        System.out.println("New Travel insurance added to your policies");
                    }
                    break;
                case 4:
                    if (this.isInsuranceExist("Car")) {
                        System.out.println("Car Insurance already exist.");
                    } else {
                        this.addNewInsurance(new CarInsurance(10, 3500));
                        System.out.println("New Car insurance added to your policies");
                    }
                    break;
                case 0:
                    onPolicyMenu = false;
                    break;
            }
        }
    }

    @Override
    public int compareTo(Account o) {
        return this.getUser().getName().compareTo(o.getUser().getName());
    }
}
